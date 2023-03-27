package Main;

import java.util.Scanner;
import Model.*;

public class VahiclesApp {
    public static void main(String[] args){
        Vahicles aCar = null, aBike = null, aBicycle = null, aTruck = null;
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Tao xe o-to");
            System.out.println("2. Tao xe dap");
            System.out.println("3. Tao xe may");
            System.out.println("4. Tao xe tai");
            System.out.println("5. Xuat ra cac xe");
            System.out.println("6. Xuat ra cac xe moi san xuat");
            System.out.println("7. Tinh tong gia tri cac xe");
            System.out.println("8. Tinh gia tri trung binh so dam da di");
            System.out.println("9. Thoat khoi chuong trinh");
            boolean flag = false;
            do{
                System.out.println("Nhap vao lua chon cua ban: ");
                choice = sc.nextInt();
                if(choice <= 0){
                    System.out.println("Invalid choice " + choice);
                    flag = true;
                }
            } while(flag);
            switch(choice){
                case 1:
                    aCar = new Car();
                    aCar.Nhap();
                    break;
                case 2:
                    aBicycle = new Bicycle();
                    aBicycle.Nhap();
                    break;
                case 3:
                    aBike = new Bike();
                    aBike.Nhap();
                    break;
                case 4:
                    aTruck = new Truck();
                    aTruck.Nhap();
                    break;
                case 5:
                    System.out.println(aCar.toString());
                    System.out.println(aBicycle.toString());
                    System.out.println(aBike.toString());
                    System.out.println(aTruck.toString());
                    break;
                case 6:
                    if ((2022 - aCar.getYear()) <= 3){
                        System.out.println(aCar.toString());
                    }
                    if ((2022 - aBicycle.getYear()) <= 3){
                        System.out.println(aBicycle.toString());
                    }
                    if ((2022 - aBike.getYear()) <= 3){
                        System.out.println(aBike.toString());
                    }
                    if ((2022 - aTruck.getYear()) <= 3){
                        System.out.println(aTruck.toString());
                    }
                    break;
                case 7:
                    System.out.println("Tong gia tri cac xe: " + (aCar.getPrice() + aBike.getPrice() + aBicycle.getPrice() + aTruck.getPrice()));
                    break;
                case 8:
                    double b;
                    b = aCar.getMileage() + aBike.getMileage() + aTruck.getMileage();
                    System.out.println("So dam trung binh da di: " + b/3);
                    break;
                case 9:
                    System.out.println("Exit.");
                    break;
            }
        } while(choice<9);
    }
}
