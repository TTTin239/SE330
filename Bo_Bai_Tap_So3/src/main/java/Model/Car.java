package Model;

public class Car extends Vahicles {
    private double mileage;
    private int numSeats;
    private int numDoors;
    private String plateNumber;

    public void Nhap(){
        boolean check = false;
        System.out.println("Input info Car:");
        super.Nhap();
        System.out.println("Input mileage: ");
        this.mileage = sc.nextDouble();
        do{
            System.out.println("Input numSeats:");
            this.numSeats = sc.nextInt();
            if(this.numSeats < 0){
                System.out.println("Invalid numSeats " + this.numSeats);
                check = true;
            }
        }while(check);
        System.out.println("Input numDoors: ");
        this.numDoors = sc.nextInt();
        System.out.println("Input plateNumber: ");
        this.plateNumber = sc.next();
        
    }
    
    public Car() {
        super();
        this.mileage = 0.0;
        this.numSeats = 0;
        this.numDoors = 0;
        this.plateNumber = "";
    }
    
    public Car(double mileage, int numSeats, int numDoors, String plateNumber) {
        this.mileage = mileage;
        this.numSeats = numSeats;
        this.numDoors = numDoors;
        this.plateNumber = plateNumber;
    }

    public Car(double mileage, int numSeats, int numDoors, String plateNumber, String model, String color, int year, int numWheels, double price, double weight) {
        super(model, color, year, numWheels, price, weight);
        this.mileage = mileage;
        this.numSeats = numSeats;
        this.numDoors = numDoors;
        this.plateNumber = plateNumber;
    }

    public double getMileage() {
        return mileage;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    @Override
    public void turn() {
        System.out.println("Car turns");
    }

    @Override
    public String toString() {
        System.out.println("Info Car:");
        return "Car{" + "mileage=" + mileage + ", numSeats=" + numSeats + ", numDoors=" + numDoors + ", plateNumber=" + plateNumber + super.toString() + " " + '}';
    }
    
}
