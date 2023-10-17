package bt1.timKiemTuyenTinhSoLonNhat;

import java.util.Arrays;

public class Main {
        private static int[] getArr(){
            int arr[] = new int[20];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() * 100);
            }
            return arr;
            /** Copyright belong to Rekkei Academy*/
        }
    public static void main(String[] args) {
//        B1: tạo 1 mảng số nguyên và gọi hàm getArr() để gán
       int[] arr= getArr();

//        B2: in ra mảng số nguyên đó
        System.out.println(Arrays.toString(arr));

//        B3: cài đặt thuật toán tuyến tính để tìm ra số lớn nhất
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
//        B4: in số lớn nhất ra.
        System.out.println(max);
    }
}
