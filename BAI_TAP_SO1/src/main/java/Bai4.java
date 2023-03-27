import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args){
        long S = 0;
        int n;
        Scanner sc;
        // Kiểm tra giá trị n không âm
        do {
            System.out.println("Input n = ");
            sc = new Scanner(System.in);
            n = sc.nextInt();
        }while (n <= 0);
        // Sử dụng vòng lặp for để tính tổng của dãy số
        for(int i = 1; i <= n; i++) {
            S += i;
        }
        System.out.println("Tong S = " + S);
        sc.close();
    }
}
