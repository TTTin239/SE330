package App;

import java.util.Scanner;
import Model.*;

public class Application {
    public static void main(String[] args) {
        WareHouse a = new WareHouse();
        int select;
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("1. Them thong tin Sach ban ra");
            System.out.println("2. Them thong tin CD ban ra");
            System.out.println("3. Tinh tien loai SACH ");
            System.out.println("4. Tinh tien loai CD ");
            System.out.println("5. Tinh tong tien sach va CD da ban");
            System.out.println("6. Them thong tin Nhan Vien");
            System.out.println("7. Tinh tong tien luong phai tra cho nhan vien hang thang");
            System.out.println("8. Xuat thong tin cua cac Nhan vien");
            System.out.println("9. Xuat thong tin tat ca loai sach da ban");
            System.out.println("10. Xuat thong tin tat ca cac loai CD da ban");
            System.out.println("11. Thoat ");
            System.out.println("Nhap lua chon cua ban: ");
            select = a.sc.nextInt();
            switch(select) {
                case 1:
                    a.nhapProduct(1);
                    break;
                case 2:
                    a.nhapProduct(2);
                    break;
                case 3:
                    Book b = new Book();
                    b.nhap();
                    System.out.println("Thanh tien : " + b.getPrice()+ "\n");
                    break;
                case 4:
                    CD c = new CD();
                    c.nhap();
                    System.out.println("Thanh tien : " + c.getPrice()+ "\n");
                    break;
                case 5:
                    System.out.println("Tong tien sach da ban : " + a.get_sum_value()+ "\n");
                    break;
                case 6:
                    a.nhapStaff();
                    break;
                case 7:
                    System.out.println("Tong tien luong phai tra cho nhan vien hang thang : " + a.get_sum_salary()+ "\n");
                    break;
                case 8:
                    System.out.println("-----THONG TIN CAC NHAN VIEN------");
                    a.xuatStaff();
                    break;
                case 9:
                    System.out.println("-----THONG TIN CAC LOAI SACH DA BAN------");
                    a.xuatBooks();
                    break;
                case 10:
                    System.out.println("-----THONG TIN CAC LOAI CD DA BAN------");
                    a.xuatCDs();
                    break;
                case 11:
                    System.out.println("Xin chao hen gap lai!!!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhap sai vui long nhap lai!!!");
                    break;
            }
        }
    } 
}
