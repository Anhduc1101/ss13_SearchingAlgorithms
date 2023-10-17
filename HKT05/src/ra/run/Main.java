package ra.run;

import ra.bussinessImp.Catalog;
import ra.bussinessImp.Product;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
   private static void handleDisplay(List<Product> productList) {
      for (int i = 0; i < productList.size(); i++) {
         productList.get(i).displayData();
      }
   }
   public static void handleAddCatalog(Scanner scanner,List<Catalog> catalogList){
      System.out.println("Nhập số lượng danh mục sản phẩm: ");
      int n= Integer.parseInt(scanner.nextLine());
      for (int i = 0; i < n; i++) {
         System.out.println("Nhập thông tin danh mục: ");
         Catalog catalog=new Catalog();
         catalog.inputData(catalogList);
         catalogList.add(catalog);
      }
   }
   public static void handleAddProduct(Scanner scanner,List<Catalog> catalogList){
      System.out.println("Nhập số lượng sản phẩm: ");
      int n = Integer.parseInt(scanner.nextLine());
      for (int i = 0; i < n; i++) {
         System.out.println("Nhập thông tin sản phẩm: ");
         Product product=new Product();
         product.inputData(catalogList);
      }
   }
   public static void handleSortByImportPriceUp(List<Product> productList){
      System.out.println("Danh sách trước khi sắp xếp: ");
      handleDisplay(productList);
      Collections.sort(productList, new Comparator<Product>() {
         @Override
         public int compare(Product o1, Product o2) {
            return (int) (o1.getExportPrice()- o2.getExportPrice());
         }
      });
      System.out.println("Danh sách sau khi sắp xếp: ");
      handleDisplay(productList);
   }
   public static void handleSearchProductByCatalogName(Scanner scanner,List<Product> productList){
      System.out.println("Nhập tên sách cần tìm: ");
      String input=scanner.nextLine();
      for (int i=0;i<productList.size();i++){
         if(productList.get(i).getCatalog().getCatalogName().toLowerCase().contains(input)){
            productList.get(i).displayData();
         }
      }
   }
}
