package Models;

public class Car extends Vehicle {
    //data class
    private double mileage;
    private String plateNumber;
    private int numSeats;
    private int numDoors;
    private int status; // 1. active , 2. off
    private DVD dvd = new DVD_Player();
    private TV tv = new TV();
    private Remote remote = new Remote();
    //method

    public Car(double mileage, String plateNumber, int numSeats) {
        this.mileage = mileage;
        this.plateNumber = plateNumber;
        this.numSeats = numSeats;
    }

    public Car() {
        this.setType(3);
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

    public int getNumDoors() {
        return this.numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
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

       
        System.out.println("Nhap bien so : ");plateNumber = sc.next();
        System.out.println();

        do {
            System.out.print("Nhap so cho ngoi : ");
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
            ",Bien so ='" + getPlateNumber() + "'" +
            ",So Cho ngoi ='" + getNumSeats() + "'" +
            "}";
    }

    public void turn () {
        System.out.println("Car turns");
    }

    public void parse (String line){
        //parse
        String data[] = null;
        data = new String[10]; // car co 10 properties 
        for (int i = 0; i < 10; i++) {
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
        int year = 0, numWheels = 0, numSeats = 0, numDoors = 0;
        double price = 0, weight = 0, mileage = 0;
        
        try {  
            year = Integer.parseInt(data[2]);
            numWheels = Integer.parseInt(data[3]);
            price = Double.parseDouble(data[4]);
            weight = Double.parseDouble(data[5]);
            mileage = Double.parseDouble(data[6]);
            numSeats = Integer.parseInt(data[8]);
            numDoors = Integer.parseInt(data[9]);
            
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    
        //[Car ] [model] [color] [year] [numWheels] [price] [weight (kg)] [mileage] [plateNumber] [numSeats] [numDoors]

        super.setInfo(model, color, year, numWheels, price, weight);
        setMileage(mileage);
        setPlateNumber(plateNumber);
        setNumSeats(numSeats);
        setNumDoors(numDoors);
        
    }

    //bat tat TV vs DVD khi xe khởi động và tắt
    public void init_Car() {
        this.status = 1;
        this.tv.turnOn();
        this.dvd.turnOn();

    }

    public void turnOff_Car () {
        this.status = 0;
        this.tv.turnOff();
        this.dvd.turnOff();
    }
    //bật tắt tăng giảm âm lượng TV thông qua remote
    
    public void upVolumnTV () {
        this.remote.upVolumnTV(this.tv);
    }

    public void downVolumnTV() {
        this.remote.downVolumnTV(this.tv);
    }

    public void turnOffTV () {
        this.remote.turnOffTV(this.tv);
    }

    public void turnOnTV() {
        this.remote.turnOnTV(this.tv);
    }

    //bật tắt tăng giảm âm lượng DVD thông qua remote
    
    public void upVolumnDVD () {
        this.remote.upVolumnDVD(this.dvd);
    }

    public void downVolumnDVD() {
        this.remote.downVolumnDVD(this.dvd);
    }

    public void turnOffDVD () {
        this.remote.turnOffDVD(this.dvd);
    }

    public void turnOnDVD() {
        this.remote.turnOnDVD(this.dvd);
    }

    //tính số tiền trả sau
    public double getInstallPay() {
        if(this.getNumDoors() == 2) return (this.getPrice()*0.6);
        return (this.getPrice()*0.65);
    }   
}