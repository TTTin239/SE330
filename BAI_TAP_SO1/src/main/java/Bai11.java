import java.util.Scanner;
import java.util.Random;
import java.math.*;
import java.util.Arrays;
import java.lang.*;
public class Bai11 {
    // Hàm tạo mảng với các giá trị ngẫu nhiên
    public static void autoRandom(int[] B, int m){
        for (int i = 0; i< m; i++) {
            double randomDouble = Math.random();
            randomDouble = randomDouble*100 + 1;
            B[i] = (int) randomDouble;
        }
    }
    // Hàm kiểm tra giá trị x có trong mảng hay không
    public static void Check(int[] C){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input x:");
        int x = sc.nextInt();
        Arrays.sort(C);
        if (Arrays.binarySearch(C, x) >= 0 ) {
            System.out.println("Gia tri " + x + " co trong mang C");
        } else {
            System.out.println("Gia tri "+ x + " khong co trong mang C");
        }
    }
    // Hàm sắp xếp giá trị tăng dần
    public static void SapXep(int[] C) {
        Arrays.sort(C);
        System.out.println("Array C: " + Arrays.toString(C));
    }
    // Hàm thay thế phần tử thứ 1->3 của mảng C bằng 3 phần tử cuối của mảng B
    public static void Show(int[] B, int[] C, int m){
        System.arraycopy(B, m-3, C, 0, 3);
        System.out.println(Arrays.toString(C));
    }
    public static void menu(int[] A, int[] B, int[] C, int n, int m){
        Scanner sc = new Scanner(System.in);
        int c;
        while(true) {
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("---------------------------------Menu-------------------------------------------");
            System.out.println("--1.    Tao mang so nguyen B voi cac gia tri ngau nhien                       --");
            System.out.println("--2.    Xuat toan bo phan tu B ra man hinh                                    --");
            System.out.println("--3.    Tao mang C tu mang A                                                  --");
            System.out.println("--4.    Thay the phan tu thu 1->3 cua mang C bang 3 phan tu cuoi cua mang B   --");
            System.out.println("--5.    Sap xep mang C tang dan va xuat ra man hinh                           --");
            System.out.println("--6.    Nhap vao x, kiem tra x co nam trong C hay khong                       --");
            System.out.println("--0.    Thoat khoi chuong trinh                                               --");
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("--                              Nhap lua chon                                 --");
            c = sc.nextInt();
            switch(c){
                case 1:
                    autoRandom(B, m);
                    break;
                case 2:
                    System.out.println(Arrays.toString(B));
                    break;
                case 3:
                    C = Arrays.copyOf(A, n);
                    break;
                case 4:
                    Show(B, C, m);
                    break;
                case 5:
                    SapXep(C);
                    break;
                case 6:
                    Check(C);
                    break;
                case 0:
                    System.out.println("Xin chao hen gap lai!!!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhap sai vui long nhap lai!");
                    break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A, B, C = null;
        int n, m;
        System.out.println("Input n: ");
        n = sc.nextInt();
        System.out.println("Input m: ");
        m = sc.nextInt();
        A = new int[n];
        B = new int[m];
        System.out.println("Nhap gia tri vao mang A:");
        for (int i = 0; i <n; i++){
            A[i] = sc.nextInt();
        }
        menu(A, B, C, n, m);
        sc.close();
    }
}
