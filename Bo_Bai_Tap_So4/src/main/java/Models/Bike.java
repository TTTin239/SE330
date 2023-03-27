package Models;

public class Bike extends Vehicle {
    //class data
    private double mileage;
    private String plateNumber;
    private int numSeats;
    //method

    public Bike(double mileage, String plateNumber, int numSeats) {
        this.mileage = mileage;
        this.plateNumber = plateNumber;
        this.numSeats = numSeats;
    }

    public Bike() {
        this.setType(2);
    }

    public double getMileage() {
        return this.mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getPlateNumber() {
        return this.plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public int getNumSeats() {
        return this.numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    public  void turn() {
        System.out.println("Bike turns");
    }

    public void input(){

        super.input();
        do {
            System.out.println("Nhap tong so km da di : ");
            try {
                mileage = sc.nextDouble(); 
            } catch (Exception e) {
                System.out.println("erro valid, please again !!");
            }
            
            if(mileage < 0 ) System.out.println("so km da di phai >=0 !!!");
        } while (mileage < 0);

        System.out.print("Nhap bien so : ");plateNumber = sc.next();
        System.out.println();

        do {
            System.out.println("Nhap so cho ngoi : ");
            try {
                numSeats = sc.nextInt(); 
            } catch (Exception e) {
                System.out.println("erro valid, please again !!");
            }
            
            if(numSeats < 0 ) System.out.println("so cho ngoi >0 !!!");
        } while (numSeats < 0);
        
    }

    @Override
    public String toString() {
        return super.toString() +
            " So miles da di ='" + getMileage() + "'" +
            ", Bien so ='" + getPlateNumber() + "'" +
            ", So cho ngoi ='" + getNumSeats() + "'" +
            "}";
    }

    public void parse (String line){
        //parse
        String data[] = new String[7];
        data = new String[9]; // Bike co 9 properties 
        for (int i = 0; i < 9; i++) {
            int startIndex = line.indexOf('[');
            int endIndex = line.indexOf(']');
            data[i] = line.substring(startIndex+1, endIndex);
            if(line.length()>1){
                line = line.substring(endIndex+1);
            } 
        }
        //convert type
        String model = data[0];
        String color = data[1];
        String plateNumber = data[7];
        int year = 0, numWheels = 0, numSeats = 0;
        double price = 0, weight = 0, mileage = 0;
        
        try {  
            year = Integer.parseInt(data[2]);
            numWheels = Integer.parseInt(data[3]);
            price = Double.parseDouble(data[4]);
            weight = Double.parseDouble(data[5]);
            mileage = Double.parseDouble(data[6]);
            numSeats = Integer.parseInt(data[8]);
            
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    
        //[Bike ] [model] [color] [year] [numWheels] [price] [weight (kg)] [mileage][plateNumber] [numSeats]
        super.setInfo(model, color, year, numWheels, price, weight);
        setMileage(mileage);
        setPlateNumber(plateNumber);
        setNumSeats(numSeats);
        
    }
    //tính số tiền trả sau
    public double getInstallPay() {
        if(this.getYear() >= 2000) return (this.getPrice()*0.7);
        return (this.getPrice()*0.75);
    }
}