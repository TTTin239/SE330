package view;
import java.awt.*;

public class FrameDemo {
    public static void main(String[] args){
        Frame fr = new Frame("This is a new frame");
        fr.setBounds(0, 0, 600, 400);
        fr.setVisible(true);
    }
}
