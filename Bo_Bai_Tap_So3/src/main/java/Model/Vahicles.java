package Model;

import java.util.Scanner;

public abstract class Vahicles {
    public Scanner sc = new Scanner(System.in);
    private String model;
    private String color;
    private int year;
    private int numWheels;
    private double price;
    private double weight;
    
    public void Nhap(){
        boolean check = false, check1 = false, check2 = false;
        System.out.println("Input model: ");
        this.model = sc.next();
        System.out.println("Input color: ");
        this.color = sc.next();
        do{
            System.out.println("Input year: ");
            this.year = sc.nextInt();
            if(this.year < 1990){
                System.out.println("Invalid year " + this.year);
                check = true;
            }
        }while(check);
        System.out.println("Input numWheels: ");
        this.numWheels = sc.nextInt();
        do{
            System.out.println("Input price: ");
            this.price = sc.nextDouble();
            if(this.price<0){
                System.out.println("Invalid price " + this.price);
                check1 = true;
            }
        }while(check1);
        do{
            System.out.println("Input weight: ");
            this.weight = sc.nextDouble();
            if(this.weight<0){
                System.out.println("Invalid weight " + this.weight);
                check2 = true;
            }
        }while(check2);
    }
    
    public Vahicles(){
        this.model = "";
        this.color = "";
        this.year = 0000;
        this.numWheels = 0;
        this.price = 0.0;
        this.weight = 0.0;
    }

    public Vahicles(String model, String color, int year, int numWheels, double price, double weight) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.numWheels = numWheels;
        this.price = price;
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public abstract void turn();

    @Override
    public String toString() {
        return ", " + "model=" + model + ", color=" + color + ", year=" + year + ", numWheels=" + numWheels + ", price=" + price + ", weight=" + weight ;
    }

    public double getMileage() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
