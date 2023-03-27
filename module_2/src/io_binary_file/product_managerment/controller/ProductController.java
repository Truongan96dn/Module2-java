package io_binary_file.product_managerment.controller;

import io_binary_file.product_managerment.service.IProductService;
import io_binary_file.product_managerment.service.ProductServive;

import java.util.Scanner;

public class ProductController {
    IProductService iProductService = new ProductServive();

    public void menuProduct() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean flag = true;
        do {
            System.out.println("Chọn chức năng  \n" +
                    "1.Hiển thị danh sách sản phẩm  \n" +
                    "2.Thêm sản phẩm  \n" +
                    "3.Tìm kiếm sản phẩm theo id \n" +
                    "4.Thoát !");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iProductService.display();
                    break;
                case 2:
                    iProductService.addProduct();
                    break;
                case 3:
                    iProductService.searchProduct();
                    break;
                case 4:
                    System.out.println("bạn đã không chọn chức năng !");
                    flag = false;
                    break;
            }
        } while (flag);
    }
}
