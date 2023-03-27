package Models;

public class DVD {
    String model;
    int volumn;
    int memmory;
    int status;

    public void upVolumn(){
        if (this.volumn < 100 && this.status==1) this.volumn++;
    }
    public  void downVolumn(){
        if (this.volumn > 0 && this.status==1) this.volumn--;
    }
    public  void turnOn(){
        this.status=1;
    }
    public  void turnOff(){
        this.status=0;
    }

    //getter, setter

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getVolumn() {
        return this.volumn;
    }

    public void setVolumn(int volumn) {
        this.volumn = volumn;
    }

    public int getMemmory() {
        return this.memmory;
    }

    public void setMemmory(int memmory) {
        this.memmory = memmory;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}