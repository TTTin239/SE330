package Models;

public class Bicycle extends Vehicle {
    //data class
    private double saddleSeatHeight;
    //method

    public Bicycle() {
        this.setType(1);
    }

    public Bicycle(double saddleSeatHeight) {
        this.saddleSeatHeight = saddleSeatHeight;
    }

    public double getSaddleSeatHeight() {
        return this.saddleSeatHeight;
    }

    public void setSaddleSeatHeight(double saddleSeatHeight) {
        this.saddleSeatHeight = saddleSeatHeight;
    }

    public void input() {

        super.input();
        do {
            System.out.println("Nhap chieu cao yen xe : ");
            try {
                saddleSeatHeight = sc.nextInt(); 
            } catch (Exception e) {
                System.out.println("erro valid, please again !!");
            }
            
            if(saddleSeatHeight < 0 ) System.out.println("chieu cao yen > 0 !!!");
        } while (saddleSeatHeight < 0);
    }

    public void turn() {
        System.out.println("Bicycle turns");
    }

    @Override
    public String toString() {
        return super.toString() +
            " chieu cao yen ='" + getSaddleSeatHeight() + "'" +
            "}";
    }

    public void parse (String line){
        //parse
        String data[] = new String[7];
        data = new String[7]; // Bicycle co 7 properties : data[0]
        for (int i = 0; i < 7; i++) {
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
        int year = 0, numWheels = 0;
        double price = 0, weight =0,saddleSeatHeight =0;

        try {  
            year = Integer.parseInt(data[2]);
            numWheels = Integer.parseInt(data[3]);
            price = Double.parseDouble(data[4]);
            weight = Double.parseDouble(data[5]);
            saddleSeatHeight = Double.parseDouble(data[6]);
            
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    
        //[model] [color] [year] [numWheels] [price] [weight (kg)] [saddleSeatHeight]
        super.setInfo(model, color, year, numWheels, price, weight);
        setSaddleSeatHeight(saddleSeatHeight); 
    }
}