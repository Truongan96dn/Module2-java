package io_binary_file.product_managerment.repository;

import io_binary_file.product_managerment.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAll();

    void add(String path, List<Product> list);

    List<Product> searchProduct(int id);
}
