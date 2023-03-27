package Model;

public class Book extends Product {
    //data class
    private String NXB;
    private int nb_of_pages;
    private int status;
    //method

    public Book() {
        type = 1;
    }

    public void nhap () {
        super.nhap();
        System.out.println("Nhap ten NXB : ");
        NXB = sc.next();
        System.out.println("Nhap so trang : ");
        nb_of_pages = sc.nextInt();
        System.out.println("Nhap tinh trang sach : 1.moi \t 2.tray : ");
        status = sc.nextInt();
    }

    public void xuat () {
        super.xuat();
        System.out.print("ten NXB : " + NXB+ "\n");
        System.out.print("so trang : " + nb_of_pages+ "\n");
        String sta = (status == 1) ? "moi" : "tray";
        System.out.print("tinh trang sach : " + sta+ "\n");

    }

    public double getPrice () {
        return (status==1) ? price*nb_of_products : (float)0.7*price*nb_of_products;

    }

    public String to_String () {
        String sta = (status == 1) ? "moi" : "tray";
        System.out.print("tinh trang sach : 1.moi \t 2.tray : " + sta);
        return (super.toString() + "ten NXB : " + NXB + "\n" +"so trang : " + nb_of_pages + "\n" + "tinh trang sach : 1.moi \t 2.tray : " + sta + "\n" );
    }
}