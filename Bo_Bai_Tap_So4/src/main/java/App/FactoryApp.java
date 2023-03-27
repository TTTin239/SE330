package App;

import java.util.InputMismatchException;
import java.util.Scanner;
import Models.Factory;
import view.*;

public class FactoryApp {
//    public static void main(String[] args) {
//        Factory a = new Factory();
//        Scanner sc = new Scanner(System.in);
//        int choice = 0;
//        boolean b = true;
//        while(true){
//            do {
//                System.out.println("------Menu------");
//                System.out.println("1.Nhap vao cac xe thu cong ");
//                System.out.println("2.Nhap vao cac xe tu dong tu file vehicles.txt");
//                System.out.println("3.Xuat ra cac xe");
//                System.out.println("4.Xuat ra cac xe moi san xuat (co nam san xuat cach nam hien tai <=3 nam)");
//                System.out.println("5.Tinh tong gia tri cac xe");
//                System.out.println("6.Tinh gia tri tb so dam (miles) da di tren cac loai xe co thong so nay");
//                System.out.println("7.So tien tra sau cho moi xe co thong so nay");
//                System.out.println("8.Thoat!!");
//                try {
//                    System.out.println("your choice");
//                    choice=sc.nextInt();
//                } catch (Exception e) {
//                    System.out.println(e);
//                }
//                                
//                // if(choice < 0 || choice >8 ) System.out.println("0 < choice < 9 !!");
//                // } while (choice < 0 || choice >8);
//
//                switch (choice) {
//                    case 1:
//                        a.input();
//                        break;
//                    case 2:
//                        a.autoInput();
//                        break;
//                    case 3:
//                        a.output();
//                        break;
//                    case 4:
//                        a.outputNewVehicles();
//                        break;
//                    case 5:
//                        System.out.println("Tong gia tri cac xe "+a.getSumPrice());
//                        break;
//                    case 6:
//                        System.out.println("So miles trung binh da di cua cac xe "+a.getSumPrice());
//                        break;
//                    case 7:
//                        break;
//                    case 8:
//                        System.out.println("Xin chao hen gap lai!!!");
//                        System.exit(0);
//                        break;
//                    default:
//                        System.out.println("Nhap sai vui long nhap lai");
//                        break;
//                }
//            } while(choice != 7);
//            if(choice==8) return;
//            try {
//                sc.close();
//            } catch (Exception e) {
//                System.out.println("not close Scanner");
//            }
//        }            
//    }
    
    public static void main(String[] args){
        Demo d = new Demo();
        d.setVisible(true);
//        FrameDemo a = new FrameDemo();
        
    }
    
}