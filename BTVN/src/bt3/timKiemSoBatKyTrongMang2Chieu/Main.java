package bt3.timKiemSoBatKyTrongMang2Chieu;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static int[][] getArr(){
        int arr[][] = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }

        }
        return arr;
        /** Copyright belong to Rekkei Academy*/
    }

//        B1: tạo 1 hàm tìm kiếm có kdl trả về là Boolean
        public static boolean getSearch(){
//        B2: trong hàm tạo 1 mảng 2 chiều và gọi hàm getArr() để gán.
            int[][] arr=getArr();
//        B3: tạo 2 List có kiểu dữ liệu là int để lưu những vị trí số đó xuất hiện.
            List<Integer> list1=new ArrayList<>();
            List<Integer> list2=new ArrayList<>();
//        B4: tạo biến check dkl bolean, mặc định = false
            boolean check=false;
//        B5: sử dụng vòng lặp lồng nhau duyệt qua tất cả phần tử của mảng 2 chiều, nếu có phần tử trùng ta sẽ add vị trí vào 2 list ở trên và đổi biết check = true.
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if(arr[i]==arr[j]){
                        list1.add(i);
                        list2.add(j);
                        check=true;
                    }
                }
            }
//                B6: in ra các vị trí và trả vể biến check
            System.out.println(list1);
            System.out.println(list2);
            check=false;
            return true;
        }

    public static void main(String[] args) {
        boolean result=getSearch();
        if(result){
            System.out.println("Số đã tìm tồn tại trong mảng");
        }else {
            System.out.println("Khoong tồn tại số đã tìm");
        }
    }
}
