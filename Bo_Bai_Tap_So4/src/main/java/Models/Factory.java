package Models;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Factory {
    private ArrayList <Vehicle> lishVehicles = new ArrayList<Vehicle>();
//method


    public static boolean isNumeric(String str) { 
  try {  
    Double.parseDouble(str);  
    return true;
  } catch(NumberFormatException e){  
    return false;  
  }  
}
    int getNumVehicle() {
        return lishVehicles.size();
    }
    String [] nameType = {"Bicycle", "Bike", "Car", "Truck"};
    Scanner sc = new Scanner(System.in);
    // Nhap Thu Cong
    public void input () {
        String numTypeString; // so loai xe can nhap thong tin
        do{
             System.out.println("Nhap so loai xe can nhap thong tin : ");
            numTypeString = sc.next();
            if(!isNumeric(numTypeString)){
                 System.out.println("Ban nhap sai moi nhap lai!");
            }
        }while(!isNumeric(numTypeString));
       int numType = Integer.parseInt(numTypeString);
//        System.out.println();
        for (int i = 0; i < numType; i++) {
            int type; // loai xe : 1.Bicycle, 2.Bike, 3.Car, 4.Truck
            int numVehicals; // so luong xe cung loai can 
            do{
            System.out.println("Nhap loai xe thu " + (i+1) + " \t  1.Bicycle \t 2.Bike \t 3.Car \t 4.Truck : ");
//            System.out.println();
            type = sc.nextInt();
            if(type <1 && type >4) System.out.println("Invalid Type!!!");}
            while (type <1 && type >4);

            do{
            System.out.println("So luong "+nameType[type-1] + " can nhap thong tin :");
            numVehicals = sc.nextInt();
            System.out.println();
            if(numVehicals < 0) System.out.println("Invalid !!!");
            } while (numVehicals < 0);
            for (int j = 0; j < numVehicals; j++) {
                Vehicle a;
                System.out.println("-----"+nameType[type-1] + " thu " + (j+1) + "-----");

                switch (type) {
                    case 1:
                        a = new Bicycle();
                        a.input();
                        lishVehicles.add(a);
                        break;
                    case 2:
                        a = new Bike();
                        a.input();
                        lishVehicles.add(a);
                        break;
                    case 3:
                        a = new Car();
                        a.input();
                        lishVehicles.add(a);
                        break;
                    case 4:
                        a = new Truck();
                        a.input();
                        lishVehicles.add(a);
                        break;
                    default:
                        break;
                    }

            }
        }

    }
    // Nhap du lieu tu dong bang file vehicle.txt
    public void autoInput () {
        BufferedReader br = null;
        FileReader fr = null;
        try {
            fr = new FileReader("C:/BTTH/SE330/vehicles.txt");
            br = new BufferedReader(fr);
            while(true){
                //get type
                String line = br.readLine();
                if (line == null){
                    break;
                }
                int endType = line.indexOf(']',1);
                String type = line.substring(1, endType);
                line = line.substring(endType+1);
                
                Vehicle a = null;
                switch(type){
                    case "Bicycle" :
                        a = new Bicycle();
                        a.parse(line);
                        break;
                    case "Bike" :
                        a = new Bike();
                        a.parse(line);
                        break;
                    case "Car" :
                        a = new Car();
                        a.parse(line);
                        break;
                    case "Truck" :
                        a = new Truck();
                        a.parse(line);
                        break;
                    default:
                        break;

                }
                lishVehicles.add(a);
            
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Fail to open file");
        }
        catch(IOException ex){
            System.out.println("Fail to read file");
        }
        finally{
            try {
                br.close();
                // fr.close();
            } catch (IOException e) {
                System.out.println("cannot close bufferedReader");
            try {
                fr.close();
            } catch (IOException ex) {
                System.out.println("cannot close FileReader");
            }
            }
        }
        

    }
    public void output() {
        int n = lishVehicles.size();
        for (int i = 0; i < n; i++) {
            System.out.println("-----XE THU "+(i+1)+"-------");
            System.out.println("------LOAI XE "+nameType[lishVehicles.get(i).getType()-1]);
            System.out.println(lishVehicles.get(i).toString());
        }
    }

    public void outputNewVehicles() { // Xuat ra cac xe co NSX cach hien tai  <=3
        int n = lishVehicles.size();
        int index = 1;
        Calendar a = Calendar.getInstance();
        int year = a.get(Calendar.YEAR);
        for (int i = 0; i < n; i++) {
            if(year - lishVehicles.get(i).getYear() <=3){
                System.out.println("-----XE THU "+index+"-------");
                System.out.println("------LOAI XE "+nameType[lishVehicles.get(i).getType()-1]);
                System.out.println(lishVehicles.get(i).toString());
                index++;
            }
        }
    }

    public double getSumPrice() { //Tong gia tri cac xe
        int n = lishVehicles.size();
        double sum =0;
        for (int i = 0; i < n; i++) {
            sum+= lishVehicles.get(i).getPrice();
        }
        return sum;
    }

    public double getAvgMiles() { // tinh số miles trung bình đã đi
        int n = lishVehicles.size();
        int count = 0; // dem so xe co thong số miles đã đi
        double sum =0;
        for (int i = 0; i < n; i++) {
            int type = lishVehicles.get(i).getType();
        // tao bien moi dua theo kieu type(2,3,4) va gan cho no phan tu da ep kieu trong listVehicles
            switch(type) {
                case 1:
                break;
                case 2:
                Bike a = new Bike();
                a = (Bike) lishVehicles.get(i);
                sum += a.getMileage();
                count++;
                break;
                case 3:
                Car b = new Car();
                b = (Car) lishVehicles.get(i);
                sum += b.getMileage();
                count++;
                break;
                case 4:
                Truck c = new Truck();
                c = (Truck) lishVehicles.get(i);
                sum += c.getMileage();
                count++;
                break;
            }
        }
        return sum/count;
    }
    //xuat so tien tra sau cua cac xe
    public void outputIntallPay() {
        int n = lishVehicles.size();
        int index = 1;
        for (int i = 0; i < n; i++) {
            int type = lishVehicles.get(i).getType();
            if(type==1) continue; // loai xe bycycle vi khong co thong so nay
            Bike bike = null;
            Car car = null;
            Truck truck = null;
            switch(type){
                case 2:
                bike = (Bike) lishVehicles.get(i);
                System.out.println("-----XE THU "+index+"-------");
                System.out.println("------LOAI XE : "+nameType[bike.getType()-1]);
                System.out.println("------MODEL : "+bike.getModel());
                System.out.println("So tien tra sau : "+bike.getInstallPay());
                break;
                case 3:
                car = (Car) lishVehicles.get(i);
                System.out.println("-----XE THU "+index+"-------");
                System.out.println("------LOAI XE : "+ nameType[car.getType()-1]);
                System.out.println("------MODEL : "+car.getModel());
                System.out.println("So tien tra sau : "+car.getInstallPay());
                    
                break;
                case 4:  
                truck = (Truck) lishVehicles.get(i);
                System.out.println("-----XE THU "+index+"-------");
                System.out.println("------LOAI XE : "+nameType[truck.getType()-1]);
                System.out.println("------MODEL : "+truck.getModel());
                System.out.println("So tien tra sau : "+ truck.getInstallPay());
                break;
                }
                
            index++;
            
        }
    }
}