import java.util.Scanner;
public class Bai9 {
    // Hàm tính tổng của 2 chuỗi x và y
    public static void show(String x, String y){
        String A;
        A = x + y;
        System.out.println("Tong chieu dai cua hai chuoi: " + A.length());
    }
    // Hàm kiểm tra 2 chuỗi x và y có bằng nhau không (Phân biệt chữ hoa, thường)
    public static void Check(String x, String y) {
        if (x.equals(y)) {
            System.out.println("Hai chuoi bang nhau");
        } else {
            System.out.println("Hai chuoi khac nhau");
        }
    }
    // Hàm kiểm tra 2 chuỗi x và y có bằng nhau không (Không phân biệt chữ hoa, thường)
    public static void Check1(String x, String y) {
        if (x.equalsIgnoreCase(y)) {
            System.out.println("Hai chuoi bang nhau");
        } else {
            System.out.println("Hai chuoi khac nhau");
        }
    }
    // Cho biết y có xuất hiện trong x hay không? Nếu có, tại vị trí nào?
    public static void Check2(String x, String y) {
        x = x.toLowerCase();
        y = y.toLowerCase();
        int a = x.indexOf(y);
        if (a == -1) {
            System.out.println("y khong xuat hien trong x");
        } else {
            System.out.println("y xuat hien trong x tai vi tri: " + a);
        }
    }
    // Cho biết kí tự thứ 6 của chuỗi x
    public static void Show1(String x){
        if (x.length() > 6) {
            System.out.println("Ki tu thu 6 cua chuoi x: " + x.charAt(6));
        } else {
            System.out.println("Chuoi x khong co ki tu thu 6");
        }
    }
    // Cho biết tất cả các vị trí xuất hiện của y trong x?
    public static void Show2(String x, String y) {
        System.out.println("Tat ca cac vi tri xuat hien cua y trong x (gia tri bang -1 la vi tri y khong có trong x)");
        for (int i = 0; i < y.length(); i++){
            System.out.print("\t" + x.indexOf(y.charAt(i)));
        }
    }
    public static void Menu (String x, String y) {
        Scanner sc = new Scanner(System.in);
        int a;
        while (true) {
            System.out.println("----------------------------------------------------------------------");
            System.out.println("------------------------------Menu------------------------------------");
            System.out.println("--1.    Tong chieu dai chuoi x va y                                 --");
            System.out.println("--2.    3 ki tu dau cua chuoi x                                     --");
            System.out.println("--3.    3 ki tu cuoi cua chuoi y                                    --");
            System.out.println("--4.    Ki tu thu 6 cua chuoi x                                     --");
            System.out.println("--5.    Chuoi moi gom 3 ki tu dau cua x va 3 ki tu sau cua y        --");
            System.out.println("--6.    Kiem tra 2 chuoi x va y (Phan biet chu hoa, thuong)         --");
            System.out.println("--7.    Kiem tra 2 chuoi x va y (Khong phan biet chu hoa, thuong)   --");
            System.out.println("--8.    Cho biet y co xuat hien trong x khong?                      --");
            System.out.println("--9.    Cho biet tat ca cac vi tri xuat hien cua y trong x          --");
            System.out.println("--0.    Thoat khoi chuong trinh                                     --s");
            System.out.println("----------------------------------------------------------------------");
            System.out.println("--                  Nhap lua chon                                   --");
            a = sc.nextInt();
            switch(a){
                case 1:
                    show(x, y);
                    break;
                case 2:
                    System.out.println("3 ki tu dau tien cua chuoi x: " + x.substring(0, 3));
                    break;
                case 3:
                    System.out.println("3 ki tu cuoi cua chuoi y: " + y.substring(y.length() - 3, y.length()));
                    break;
                case 4:
                    Show1(x);
                    break;
                case 5:
                    System.out.println("Chuoi moi tu 3 ki tu dau cua x va 3 ki tu cuoi cua y: " + x.substring(0, 3) + y.substring(y.length()-3, y.length()));
                    break;
                case 6:
                    Check(x, y);
                    break;
                case 7:
                    Check1(x, y);
                    break;
                case 8:
                    Check2(x, y);
                    break;
                case 9:
                    Show2(x, y);
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
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi x: ");
        String x, y;
        x = sc.nextLine();
        System.out.println("Nhap chuoi y: ");
        y = sc.nextLine();
        Menu(x, y);
        sc.close();
    }
}
