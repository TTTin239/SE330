
import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Bai10 {
    // Hàm kiểm tra năm nhuận
    public static boolean isLeapYear(Calendar a){
        if ((a.get(Calendar.YEAR) % 4 == 0) && (a.get(Calendar.YEAR) % 100 != 0) || (a.get(Calendar.YEAR) % 400 ==0)) {
            return true;
        }
        return false;
    }
    // Hàm hiện thị ngày kế tiếp
    public static void NextDay(Calendar a){
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        a.add(Calendar.DATE, 1);
        System.out.println("Ngay tiep theo cua a la: " + df.format(a.getTime()));
    }
    // Hàm hiện thị ngày trước đó
    public static void LastDay(Calendar a) {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        a.add(Calendar.DATE, -2);
        System.out.println("Ngay truoc do cua a la: " + df.format(a.getTime()));
    }
    // Hàm so sánh ngày a và ngày b
    public static void Check(Calendar a, Calendar b) {
        if (a.before(b)) {
            System.out.println("Ngay cua a truoc ngay cua b");
        } else {
            if (a.after(b)) {
                System.out.println("Ngay cua a sau ngay cua b");
            } else {
                System.out.println("Ngay cua a va b trung nhau");
            }
        }
    }
    // Hàm hiện thị số ngày trong tháng
    public static void DayinMonth(Calendar a) {
        int [] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        boolean check = isLeapYear(a);
        if (check == true) {
            day[1] += 1;
        } else {
            day[1] += 0;
        }
        System.out.println("So ngay trong thang " + (a.get(Calendar.MONTH) + 1) + " nam " + a.get(Calendar.YEAR) + " la: " + day[a.get(Calendar.MONTH)]);
    }
    public static void menu(Calendar a, Calendar b) {
        Scanner sc = new Scanner(System.in);
        int c;
        while(true) {
            System.out.println("----------------------------------------------------------------------");
            System.out.println("------------------------------Menu------------------------------------");
            System.out.println("--1.    So sanh a va b                                              --");
            System.out.println("--2.    Hien thi ngay tiep theo cua a                               --");
            System.out.println("--3.    Hien thi ngay truoc do cua a                                --");
            System.out.println("--4.    Ngay a la ngay thu bao nhieu trong nam                      --");
            System.out.println("--5.    Thang chua a co bao nhieu ngay                              --");
            System.out.println("--6.    Nam chua a co phai nam nhuan hay khong?                     --");
            System.out.println("--0.    Thoat khoi chuong trinh                                     --");
            System.out.println("----------------------------------------------------------------------");
            System.out.println("--                         Nhap lua chon                            --");
            c = sc.nextInt();
            switch(c){
                case 1:
                    Check(a, b);
                    break;
                case 2:
                    NextDay(a);
                    break;
                case 3:
                    LastDay(a);
                    break;
                case 4:
                    System.out.println("Ngay a la ngay thu " + (a.get(Calendar.DAY_OF_YEAR) + 1) + " trong nam");
                    break;
                case 5:
                    DayinMonth(a);
                    break;
                case 6:
                    boolean check = isLeapYear(a);
                    if (check == true) {
                        System.out.println("a la nam nhuan");
                    } else {
                        System.out.println("a khong phai la nam nhuan");
                    }
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
        Date a = new Date();
        Date b = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Calendar a1 = Calendar.getInstance();
        Calendar b1 = Calendar.getInstance();
        try {
            System.out.println("Input date a: ");
            a = df.parse(sc.nextLine());
            System.out.println("Input date b:");
            b = df.parse(sc.nextLine());
        } catch (ParseException ex) {
        }
        a1.setTime(a);
        b1.setTime(b);
        menu(a1, b1);
        sc.close();
    }
}
