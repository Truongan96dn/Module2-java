package io_binary_file.product_managerment.service;

import io_binary_file.product_managerment.model.Product;
import io_binary_file.product_managerment.repository.IProductRepository;
import io_binary_file.product_managerment.repository.ProductRepository;

import java.util.List;
import java.util.Scanner;

public class ProductServive implements IProductService {
    public static final String PATH = "module_2/src/io_binary_file/data/ProductList.dat";
    IProductRepository iProductRepository = new ProductRepository();

    @Override
    public void display() {
        List<Product> productList = iProductRepository.getAll();
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void addProduct() {
        List<Product> list = iProductRepository.getAll();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println(" Nhập tên sản phẩm : ");
        String nameProduct = scanner.nextLine();
        System.out.println("Nhập ngày sản xuất ");
        String dateOfManufacture = scanner.nextLine();
        System.out.println("Nhập màu");
        String color = scanner.nextLine();
        Product product = new Product(id, nameProduct, dateOfManufacture, color);
        list.add(product);
        iProductRepository.add(PATH, list);
        System.out.println("Thêm thành công !");
    }

    @Override
    public void searchProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id cần tìm kiếm : ");
        int id = Integer.parseInt(scanner.nextLine());
        List<Product> list = iProductRepository.searchProduct(id);
        if (list.isEmpty()) {
            System.out.println("Không tồn tại sản phẩm cần tìm ");
        } else {
            System.out.println(list);
        }
    }
}
