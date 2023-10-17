package bt4.timKiemTuyenTinhTrongMangSoNguyen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        B1 tạo mảng cho sẵn phần tử
        int[] arr = {9, 3, 7, 1, 9, 6, 3, 8, 4, 5};

//        B2: lấy số cần tìm từ scanner.
        System.out.println("Nhập vào số cần tìm: ");
        int inputNumber = Integer.parseInt(scanner.nextLine());

//        B3: tìm số nhập vào và in ra.
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            check = false;
            if (arr[i] == inputNumber) {
                System.out.println("phần tử " + inputNumber + " tại vị trí thứ " + i);
                break;
            } else {
                check = true;
            }
        }
        if (check) {
            System.out.println("Không tìm thấy số bạn vừa nhập");
        }
    }
}
