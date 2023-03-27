import java.util.Scanner;
public class Bai12 {
     static void Show(int matrix[][], int n, int m)
    {
        matrix[0][0] = 1;
        if (n != m) {
            System.out.println("Ma tran phai la ma tran vuong");
            return;
        }
        else {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = matrix[0][0];
                for (int j = 0; j < m; j++) {
                    if (i < j) {
                        matrix[i][j] = 0;
                    } else {
                        if (i == j) {
                            matrix[i][j] = matrix[0][0];
                        }
                        else {
                            matrix[i][j+1] = matrix[i-1][j] + matrix[i-1][j+1];
                        }
                    }
                }
            }
 
            System.out.println("Mang duoc xuat ra:-");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (i >= j) {
                        System.out.print(matrix[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,m;
        // Giá trị n là số dòng
        // Giá trị m là số cột
        // Nhập n và m bằng nhau
        System.out.println("Enter the number of rows: ");
        n = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        m = sc.nextInt();
        int[][] A;
        A = new int[n][m];
        Show(A, n, m);
    }
}
