package Model;

public class Bike extends Vahicles {
    private double mileage;
    private String plateNumber;
    private int numSeats;
    
    public void Nhap() {
        boolean check = false;
        System.out.println("Input info Bike: ");
        System.out.println("Input mileage: ");
        this.mileage = sc.nextDouble();
        System.out.println("Input plateNumber: ");
        this.plateNumber = sc.next();
        do{
            System.out.println("Input numSeats:");
            this.numSeats = sc.nextInt();
            if(this.numSeats < 0){
                System.out.println("Invalid numSeats " + this.numSeats);
                check = true;
            }
        }while(check);
        super.Nhap();
    }
    
    public Bike() {
        super();
        this.mileage = 0.0;
        this.plateNumber = "";
        this.numSeats = 0;
    }

    public Bike(double mileage, String plateNumber, int numSeats) {
        this.mileage = mileage;
        this.plateNumber = plateNumber;
        this.numSeats = numSeats;
    }

    public Bike(double mileage, String plateNumber, int numSeats, String model, String color, int year, int numWheels, double price, double weight) {
        super(model, color, year, numWheels, price, weight);
        this.mileage = mileage;
        this.plateNumber = plateNumber;
        this.numSeats = numSeats;
    }
    
    public double Mileage(double mileage){
        return this.mileage = mileage;
    }

    public double getMileage() {
        return mileage;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public int getNumSeats() {
        return numSeats;
    }

    @Override
    public void turn() {
        System.out.println("Bike turns");
    }

    @Override
    public String toString() {
        System.out.println("Info Bike: ");
        return "Bike{" + "mileage=" + mileage + ", plateNumber=" + plateNumber + ", numSeats=" + numSeats + super.toString() + " " + '}';
    }
    
}
