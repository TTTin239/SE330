package Models;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Vehicle {
    private String model;
    private String color;
    private int year;
    private int numWheels;
    private double price;
    private double weight;
    private int type; //1.Bicycle , 2.Bike, 3.Car, 4.Truck.

    public Vehicle() {
    }

    public Vehicle(String model, String color, int year, int numWheels, double price, double weight) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.numWheels = numWheels;
        this.price = price;
        this.weight = weight;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumWheels() {
        return this.numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    

    public void setType(int type) {
        this.type = type;
    }

    public int getType() {
        return this.type;
    }

    Scanner sc = new Scanner(System.in);
    public void input() {
        Pattern p = Pattern.compile("[^A-Za-z0-9]");
        boolean b;
        do{
        System.out.print("Nhap model xe : ");model = sc.next();
        System.out.println();
        Matcher m = p.matcher(model);
        b = m.find();
        if (b==true) System.out.println("chuoi khong duoc chua ki tu dac biet");
        } while (b==true);

        // do{
        //     System.out.print("Nhap NSX xe : ");year = sc.nextInt();
        //     System.out.println();
        //     if (year < 1990 || year > 2022) System.out.println("Sai nam san xuat (2022 >=NSX >= 1990");
        // } while (year < 1990 || year > 2022);

        do {
            try {
                System.out.print("Nhap NSX xe : ");year = sc.nextInt(); 
            } catch (Exception e) {
                System.out.println("erro, please again !!");
            }
            if(year < 1990 || year > 2022) System.out.println("Sai nam san xuat (2022 >= NSX >= 1990");
        } while (year < 1990 || year > 2022);

        System.out.print("Nhap mau xe : ");color = sc.next();
        System.out.println();
        do {
            try {
                System.out.print("Nhap so banh xe : "); numWheels = sc.nextInt(); 
            } catch (Exception e) {
                System.out.println("erro, please again !!");
            }
            if(numWheels < 0) System.out.println("so banh xe phai > 0");
        } while (numWheels < 0);

        do {
            try {
                System.out.print("Nhap gia xe : ");price = sc.nextDouble(); 
            } catch (Exception e) {
                System.out.println("erro, please again !!");
            }
            if(price < 0) System.out.println("gia xe phai > 0");
        } while (price < 0);

        do {
            try {
                System.out.print("Nhap can nang xe : ");weight = sc.nextDouble(); 
            } catch (Exception e) {
                System.out.println("erro, please again !!");
            }
            if(weight < 0) System.out.println("can nang xe phai > 0");
        } while (price < 0);



    }

    @Override
    public String toString() {
        return "{" +
            " model ='" + getModel() + "'" +
            ", color ='" + getColor() + "'" +
            ", NSX ='" + getYear() + "'" +
            ", So banh xe ='" + getNumWheels() + "'" +
            ", Gia ='" + getPrice() + "'" +
            ", Can Nang ='" + getWeight() + "'"
            ;
    }

    public void setInfo(String model, String color, int year, int numWheels, double price, double weight) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.numWheels = numWheels;
        this.price = price;
        this.weight = weight;

    }
    public abstract void parse(String line); 
    public abstract void turn();

}
