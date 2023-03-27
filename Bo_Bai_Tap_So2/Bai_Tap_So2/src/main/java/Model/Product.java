package Model;
import java.util.Scanner;

public abstract class Product {
    //data class
    protected String id;
    protected String name;
    protected int year;
    protected double price;
    protected int nb_of_products;
    protected int type; // loai san pham 1.Book , 2.Cd
    //method
    public Scanner sc = new Scanner(System.in);
    public void nhap () {
        System.out.println("Nhap id san pham : ");id = sc.nextLine();
        System.out.println("Nhap ten san pham : ");name = sc.nextLine();
        System.out.println("Nhap nam san xuat : ");year = sc.nextInt();
        System.out.println("Nhap gia san pham : ");price = sc.nextDouble();
        System.out.println("Nhap so luong san pham : ");nb_of_products = sc.nextInt();
    }

    public void xuat () {
        System.out.print("Id san pham : " + id + "\n");
        System.out.print("Ten san pham : " + name+ "\n");
        System.out.print("Nam san xuat : " + year+ "\n");
        System.out.print("Gia san pham : " + price+ "\n");
    }

    public abstract double getPrice();

    public String to_String() {
        return ("Id san pham : " + id + "\n" + "Ten san pham : " + name + "\n" + "Nam san xuat : " + year
                + "\n" + "Gia san pham : " + price + "\n");
    }

    public int getType() {

        return type;
    }
}