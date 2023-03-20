package arraylist_linkedlist.product_managerment.view;

import arraylist_linkedlist.product_managerment.model.Product;
import arraylist_linkedlist.product_managerment.manager.ProductManager;
import arraylist_linkedlist.product_managerment.manager.IProductManager;

import java.util.Comparator;
import java.util.Scanner;

public class ProductMain implements Comparator<Product> {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Quản lý sản phẩm " +
                    "\n 1 . Thêm sản phẩm " +
                    "\n 2 . Sửa thông tin sản phẩm " +
                    "\n 3 . Xoá sản phẩm " +
                    "\n 4 . Hiển thị danh sách sản phẩm " +
                    "\n 5 . Tìm kiếm sản phẩm " +
                    "\n 6 . Sắp sếp sản phẩm tăng dần và giảm dần " +
                    "\n 7 . Thoát ! ");
            System.out.println("Xin vui lòng chọn chức năng ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    productManager.addProduct();
                    productManager.displayProduct();
                    break;
                case 2:
                    productManager.fixPriceAndName();
                    productManager.displayProduct();
                    break;
                case 3:
                    productManager.deleteProduct();
                    productManager.displayProduct();
                    break;
                case 4:
                    productManager.displayProduct();
                    break;
                case 5:
                    productManager.displayProduct();
                    productManager.searchProduct();
                    break;
                case 6:
                    productManager.sortProduct();
                    break;
                case 7:
                    flag = false;
                    break;
            }
        } while (flag);
    }

    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o1.getProductPrice() - o2.getProductPrice());
    }

    @Override
    public Comparator<Product> reversed() {
        return Comparator.super.reversed();
    }
}
