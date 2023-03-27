package Models;

public class TV  {
    private String model;
    private int volumn;
    private int channel=1;
    private int status;

    public  void upVolumn(){
        if (this.volumn < 100) this.volumn++;
    }
    public  void downVolumn(){
        if (this.volumn > 0) this.volumn--;
    }
    public  void turnOn(){
        this.status=1;
    }
    public  void turnOff(){
        this.status=0;
    }

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

    public int getChannel() {
        return this.channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}