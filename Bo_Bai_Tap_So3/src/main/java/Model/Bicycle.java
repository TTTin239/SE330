package Model;

public class Bicycle extends Vahicles {
    private double saddleSeatHeight;

    public void Nhap() {
        System.out.println("Input info Bicycle:");
        System.out.println("Input saddleSeatHeight: ");
        this.saddleSeatHeight = sc.nextDouble();
        super.Nhap();
    }
    
    public Bicycle() {
        super();
        this.saddleSeatHeight = 0.0;
    }
    
    public Bicycle(double saddleSeatHeight) {
        this.saddleSeatHeight = saddleSeatHeight;
    }

    public Bicycle(double saddleSeatHeight, String model, String color, int year, int numWheels, double price, double weight) {
        super(model, color, year, numWheels, price, weight);
        this.saddleSeatHeight = saddleSeatHeight;
    }

    public double getSaddleSeatHeight() {
        return saddleSeatHeight;
    }

    @Override
    public void turn() {
        System.out.println("Bicycle turns");
    }

    @Override
    public String toString() {
        System.out.println("Info Bicycle: ");
        return "Bicycle{" + "saddleSeatHeight=" + saddleSeatHeight + super.toString() + " " + '}';
    }
    
}
