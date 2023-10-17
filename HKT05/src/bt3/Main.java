package bt3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Queue<String> queue = new LinkedList<>();
    static String input;

    public static void main(String[] args) {
        while (true) {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-3-MENU***************");
            System.out.println("1. Nhập tên phụ huynh nộp hồ sơ ");
            System.out.println("2. Phụ huynh tiếp theo ");
            System.out.println("3. Thoát ");
            System.out.println("Mời nhập lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            handleChoice(choice);
        }
    }

    private static void handleChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Nhập tên phụ huynh: ");
                input = scanner.nextLine();
                queue.add(input);
                break;
            case 2:
                System.out.println(queue);
                System.out.println("phụ huynh vừa bị xóa: "+queue.poll());;
                break;
            case 3:
                System.exit(0);
                break;

        }
    }
}
