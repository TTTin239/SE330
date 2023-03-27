package Model;

import java.util.ArrayList;
import java.util.Scanner;

public class WareHouse {
    private ArrayList <Book> listBooks = new ArrayList<Book>();
    private ArrayList <CD> listCDs = new ArrayList<CD>();
    private ArrayList <Staff> listStaff = new ArrayList<Staff>();
    //method
    public Scanner sc = new Scanner(System.in);
    public void nhapProduct (int type) {
        
        String type_product = (type == 1) ? "sach" : "CD";
        int nb_of_id;// so luong loai san pham 
        System.out.println("So luong loai " + type_product +" : ");
        nb_of_id = sc.nextInt();
        for (int i = 0; i < nb_of_id; i++) {
            System.out.print("-------Nhap thong tin san pham thu " +(i+1)+"--------");
            System.out.println();
            if(type == 1) {
                Book a;
                a = new Book();
                a.nhap();
                listBooks.add(a);
            }
            else {
                CD a;
                a = new CD();
                a.nhap();
                listCDs.add(a);
            }
            System.out.print("\n");
        }
    }
    public void xuatBooks() {
        int n = listBooks.size();
        for (int i = 0; i < n; i++) {
            String type = (listBooks.get(i).getType()==1) ? "SACH" : "CD"; //LAY LOAI SAN PHAM
            System.out.print("------San pham " + i+1 + "-------");
            System.out.println();
            System.out.print("Loai san pham : " + type);
            System.out.println();
            listBooks.get(i).xuat();
        }

    }

    public void xuatCDs() {
        int n = listCDs.size();
        for (int i = 0; i < n; i++) {
            String type = (listCDs.get(i).getType()==1) ? "SACH" : "CD"; //LAY LOAI SAN PHAM
            System.out.print("------San pham " + i+1 + "-------");
            System.out.println();
            System.out.print("Loai san pham : " + type);
            System.out.println();
            listCDs.get(i).xuat();
        }
    }


    public void nhapStaff() {
        int nb_of_id;// so luong nhan vien
        System.out.print("So NHAN VIEN can nhap : ");nb_of_id = sc.nextInt();
        System.out.println();
        for (int i = 0; i < nb_of_id; i++) {
            Staff a;
            int type;
            System.out.print("-------Nhap thong tin NHAN VIEN thu " +(i+1)+"--------");
            System.out.println();
            System.out.print("Loai thong tin NHAN VIEN  : 1.Ban Hang \t 2.Quan Li : ");type = sc.nextInt();
            if(type == 1) {
                a = new Sales();
                a.nhap();
                listStaff.add(a);
            }
            else {
                a = new Manager();
                a.nhap();
                listStaff.add(a);
            }
            System.out.print("\n");

        }

    }

    public void xuatStaff() {
        int n = listStaff.size();
        for (int i = 0; i < n; i++) {
            String type = (listStaff.get(i).job_pos==1) ? "BAN HANG" : "QUAN LI"; //LAY LOAI Thong tin Nhan vien
            System.out.print("------NHAN VIEN " + i+1 + "-------");
            System.out.println();
            System.out.print("---- NHAN VIEN : " + type + " -------");
            System.out.println();
            listStaff.get(i).xuat();
        }

    }

    public int get_nb_books() {
        return listBooks.size();
    }

    public int get_nb_cd() {
        return listCDs.size();
    }

    public double get_sum_value () { // tinh thanh tien tat ca cac san pham da ban
        
        double result = 0;
        int n = listBooks.size();
        int m = listCDs.size();
        if(m==0 && n==0) return 0;
        for (int i = 0; i < n; i++) {
            result += listBooks.get(i).getPrice();
        }
        for (int i = 0; i < m; i++) {
            result += listCDs.get(i).getPrice();
        }
        return result;

    } 

    public double get_sum_salary () { // tinh tong tien luong phai tra cho tat ca nhan vien
        double result = 0;
        int n = listStaff.size();
        if(n==0) return 0;
        for (int i = 0; i < n; i++) {
            result += listStaff.get(i).getSalary();
        }
        return result;
    } 
}
