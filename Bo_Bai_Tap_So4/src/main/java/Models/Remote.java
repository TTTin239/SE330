package Models;

public class Remote {
    // các chức năng của remote
    public void upVolumnTV(TV tv) {
        tv.upVolumn();
   }
    public void downVolumnTV(TV tv) {
       tv.downVolumn();
   }
    public void turnOnTV(TV tv) {
       tv.turnOn();

   }
    public void turnOffTV(TV tv) {
        tv.turnOff();
   }
    public void upVolumnDVD(DVD dvd) {
        dvd.upVolumn();
   }
    public void downVolumnDVD(DVD dvd) {
        dvd.downVolumn();
   }
    public void turnOnDVD(DVD dvd) {
        dvd.turnOn();
    }
    public void turnOffDVD(DVD dvd) {
        dvd.turnOff();
   }
}