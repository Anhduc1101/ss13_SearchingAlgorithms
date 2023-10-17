package ra.run;

import ra.bussinessImp.Catalog;
import ra.bussinessImp.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    static Scanner scanner = new Scanner(System.in);
    static List<Catalog> catalogList = new ArrayList<>();
    static List<Product> productList = new ArrayList<>();

    static {
        catalogList.add(new Catalog(1, "nghệ thuật", 1, "SGK", true));
        catalogList.add(new Catalog(2, "văn học", 3, "SGK", true));
        catalogList.add(new Catalog(3, "khoa học và công nghệ", 2, "SGK", true));
    }

    static {
        productList.add(new Product(1, "làng", "truyện ngắn", "của tác giả Kim Lân", catalogList.get(1), 2000, 2500, true));
        productList.add(new Product(3, "xuân tóc đỏ", "truyện ngắn", "của tác giả Vũ Tọng Phụng", catalogList.get(2), 1000, 3000, true));
        productList.add(new Product(2, "abc", "truyện ngắn", "của tác giả Kim Lân", catalogList.get(0), 1000, 2200, true));
    }

    public static void main(String[] args) {
        for (Catalog cat : catalogList) {
            cat.displayData();
        }
        for (Product pro : productList) {
            pro.displayData();
        }
        while (true) {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-2-MENU***************");
            System.out.println("1. Nhập số danh mục sản phẩm và nhập thông tin các danh mục");
            System.out.println("2. Nhập số sản phẩm và nhập thông tin các danh mục");
            System.out.println("3. Sắp xếp sản phẩm theo giá sản phẩm tăng dần");
            System.out.println("4. Tìm kiếm sản phẩm theo tên danh mục ");
            System.out.println("5. Thoát ");
            System.out.println("Mời lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    Main.handleAddCatalog(scanner, catalogList);
                    break;
                case 2:
                    Main.handleAddProduct(scanner, catalogList);
                    break;
                case 3:
                    Main.handleSortByImportPriceUp(productList);
                    break;
                case 4:
                    Main.handleSearchProductByCatalogName(scanner, productList);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này !");
                    break;
            }
        }

    }


}
