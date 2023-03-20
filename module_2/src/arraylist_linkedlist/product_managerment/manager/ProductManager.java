package arraylist_linkedlist.product_managerment.manager;

import arraylist_linkedlist.product_managerment.model.Product;
import arraylist_linkedlist.product_managerment.view.ProductMain;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ProductManager implements IProductManager {

    private static ArrayList<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "EcoFan", 1000));
        productList.add(new Product(2, "LuxuryFan", 1500));
        productList.add(new Product(3, "DiamondFan", 2000));
        productList.add(new Product(4, "JustFan", 500));
    }

    @Override
    public void addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ID sản phẩm mới : ");
        int newID = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm mới : ");
        String newProductName = scanner.nextLine();
        System.out.println("Nhập giá sản phẩn mới : ");
        double price = scanner.nextDouble();
        Product product = new Product(newID, newProductName, price);
        productList.add(product);
        System.out.println("Thêm sản phẩm mới thành công !");


    }

    @Override
    public void deleteProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ID mà bạn muốn xoá :");
        int removeID = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productList.size(); i++) {
            if (removeID == productList.get(i).getProductID()) {
                System.out.println("Bạn có muốn xoá sản phẩn " + productList.get(i).getProductName() + " không ?");
                System.out.println("1. Có ");
                System.out.println("2. Không  ");
                int number = Integer.parseInt(scanner.nextLine());
                switch (number) {
                    case 1:
                        productList.remove(i);
                        System.out.println("Bạn đã xoá sản phẩm thành công !");
                        break;
                    case 2:
                        System.out.println("Bạn đã không xoá !");
                        break;
                }

            }

        }

    }

    @Override
    public void displayProduct() {
        for (Product product : productList) {
            System.out.println(product);
        }

    }

    @Override
    public void fixPriceAndName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ID mà bạn muốn sửa :");
        int fixID = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productList.size(); i++) {
            if (fixID == productList.get(i).getProductID()) {
                System.out.println("Bạn có muốn sửa thông tin gì của sản phẩm " + productList.get(i).getProductName());
                System.out.println("1. Giá sản phẩm ");
                System.out.println("2. Tên sản phẩm  ");
                System.out.println("3. Bạn đã không sửa gì  ");
                int number = Integer.parseInt(scanner.nextLine());
                switch (number) {
                    case 1:
                        System.out.println("Nhập giá bạn muốn sửa :");
                        double price = scanner.nextDouble();
                        productList.get(i).setProductPrice(price);
                        System.out.println("Bạn đã thay đổi giá thành công!");
                        break;
                    case 2:
                        System.out.println("Nhập tên bạn muốn đổi :");
                        String newName = scanner.nextLine();
                        productList.get(i).setProductName(newName);
                        System.out.println("Bạn đã đổi tên sản phẩm thành công !");
                        break;
                    case 3:
                        System.out.println("Bạn đã không thay đổi gì");
                        break;
                }
            }
        }
    }

    @Override
    public void searchProduct() {
        boolean flag = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm mà bạn muốn tìm kiếm :");
        String name = scanner.nextLine();
        for (int i = 0; i < productList.size(); i++) {
            if (name.equals(productList.get(i).getProductName())) {
                System.out.println("Sản phẩm bạn tìm hiện đang có trên hệ thống với giá là : " + productList.get(i).getProductPrice() + "¥");
                flag = true;
            }
        }
        if (!flag)
            System.out.println("Sản phẩm của bạn không có trên hệ thống , vui lòng nhập lại tên sản phẩm !");
    }

    @Override
    public void sortProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bạn muốn sắp xếp như thế nào " +
                "\n 1 . Tăng dần " +
                "\n 2 . Giảm dần ");
        int numb = Integer.parseInt(scanner.nextLine());
        switch (numb) {
            case 1:
                Collections.sort(productList, new ProductMain());
                for (int i = 0; i < productList.size(); i++) {
                    System.out.println(productList.get(i));
                }
                break;
            case 2:
                Collections.reverse(productList);
                for (int i = 0; i < productList.size(); i++) {
                    System.out.println(productList.get(i));
                }
                break;
        }
    }
}
