package io_binary_file.product_managerment.repository;

import io_binary_file.product_managerment.model.Product;
import io_binary_file.product_managerment.util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    public static final String PATH = "module_2/src/io_binary_file/data/ProductList.dat";

    @Override
    public List<Product> getAll() {
        return ReadAndWrite.readFromBinaryFile(PATH);
    }

    @Override
    public void add(String path, List<Product> list) {
        ReadAndWrite.writeToBinaryFile(path, list);

    }

    @Override
    public List<Product> searchProduct(int id) {
        List<Product> products = ReadAndWrite.readFromBinaryFile(PATH);
        List<Product> listProduct = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                listProduct.add(products.get(i));
            }
        }
        return listProduct;
    }

}
