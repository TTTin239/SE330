package Model;

public class Truck extends Vahicles {
    private double mileage;
    private String plateNumber;
    private double loadCapacity;
    
    public void Nhap(){
        System.out.println("Input info Truck:");
        System.out.println("Input mileage: ");
        this.mileage = sc.nextDouble();
        System.out.println("Input plateNumber: ");
        this.plateNumber = sc.next();
        System.out.println("Input loadCapacity: ");
        this.loadCapacity = sc.nextDouble();
        super.Nhap();
    }
    
    public Truck() {
        super();
        this.mileage = 0.0;
        this.plateNumber = "";
        this.loadCapacity = 0.0;
    }

    public Truck(double mileage, String plateNumber, double loadCapacity) {
        this.mileage = mileage;
        this.plateNumber = plateNumber;
        this.loadCapacity = loadCapacity;
    }

    public Truck(double mileage, String plateNumber, double loadCapacity, String model, String color, int year, int numWheels, double price, double weight) {
        super(model, color, year, numWheels, price, weight);
        this.mileage = mileage;
        this.plateNumber = plateNumber;
        this.loadCapacity = loadCapacity;
    }

    public double getMileage() {
        return mileage;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public void turn() {
        System.out.println("Truck turns");
    }

    @Override
    public String toString() {
        System.out.println("Info Truck: ");
        return "Truck{" + "mileage=" + mileage + ", plateNumber=" + plateNumber + ", loadCapacity=" + loadCapacity + super.toString() + " " + '}';
    }
    
}
