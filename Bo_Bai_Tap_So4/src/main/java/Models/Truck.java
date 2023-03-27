package Models;

public class Truck extends Vehicle {
    private double mileage;
    private String plateNumber;
    private int loadCapacity;
    private int status = 0; // 1. active , 2. off
    private TV tv = new LCD_Television();
    private DVD dvd = new DVD_Player();
    private Remote remote = new Remote();
    // private Remote DVD = new DVD_Player();
    // private Remote TV = new LCD_Television();
    //method

    public Truck() {
        this.tv.setStatus(0);
        this.dvd.setStatus(0);
        this.setType(4);
    }
    
    public Truck(double mileage, String plateNumber, int loadCapacity) {
        this.mileage = mileage;
        this.plateNumber = plateNumber;
        this.loadCapacity = loadCapacity;
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

    public int getLoadCapacity() {
        return this.loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void input() {
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
//        System.out.println();

       
        System.out.println("Nhap bien so : ");plateNumber = sc.next();
//        System.out.println();

        do {
            System.out.print("Nhap tai trong (kg) : ");
            try {
                loadCapacity = sc.nextInt(); 
            } catch (Exception e) {
                System.out.println("erro valid, please again !!");
            }
            
            if(loadCapacity < 0 ) System.out.println("tai trong phai >=0 ");
        } while (loadCapacity < 0);
    }

    public void turn() {
        System.out.println("Truck turns");

    }

    public void  transportGoods(String goodType, int load) {
        System.out.println(goodType);
        System.out.println("Suc tai : "+load);

    }

    @Override
    public String toString() {
        return super.toString() +
            " So miles da di ='" + getMileage() + "'" +
            ", Bien so ='" + getPlateNumber() + "'" +
            ", Suc tai ='" + getLoadCapacity() + "'" +
            "}";
    }

    public void parse (String line){
        //parse
        String data[] = new String[7];
        data = new String[9]; // car co 9 properties 
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
        int year = 0, numWheels = 0, loadCapacity =0;
        double price = 0, weight = 0, mileage = 0;
        
        try {  
            year = Integer.parseInt(data[2]);
            numWheels = Integer.parseInt(data[3]);
            price = Double.parseDouble(data[4]);
            weight = Double.parseDouble(data[5]);
            mileage = Double.parseDouble(data[6]);
            loadCapacity = Integer.parseInt(data[8]);
            
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    
        //[Truck ] [model] [color] [year] [numWheels] [price] [weight (kg)] [mileage] [plateNumber] [loadCapacity (kg)]

        super.setInfo(model, color, year, numWheels, price, weight);
        setMileage(mileage);
        setPlateNumber(plateNumber);
        setLoadCapacity(loadCapacity);
    }
    //bat tat TV vs DVD khi xe khởi động và tắt
    public void init_Truck() {
        this.status = 1;
        this.tv.turnOn();
        this.dvd.turnOn();

    }

    public void turnOff_Truck() {
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
        if(this.getLoadCapacity() >= 0 && this.getLoadCapacity() <= 5000) return (this.getPrice()*0.5);
        return (this.getPrice()*0.4);
    }
}