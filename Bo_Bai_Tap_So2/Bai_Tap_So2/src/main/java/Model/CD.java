package Model;

public class CD extends Product {
    //data class
    private String brand;
    private String singer;
    //method
    public CD() {
        type = 2;
    }
    public void nhap() {
        super.nhap();
        System.out.println("Nhap ten hang thu am : ");
        brand = sc.next();
        System.out.println("Nhap ten ca si : ");
        singer = sc.next();
    }

    public void xuat() {
        super.xuat();
        System.out.print("Ten hang thu am : " + brand+ "\n");
        System.out.print("Ten ca si : " + singer+ "\n");
    }

    public double getPrice () {

        return (year < 1990) ? (float)price*0.9*nb_of_products : price*nb_of_products ;
    }

    public String to_String () {
        return (super.to_String() + "Ten hang thu am : " + brand + "\n" + "Ten ca si : " + singer + "\n");
    }
}
