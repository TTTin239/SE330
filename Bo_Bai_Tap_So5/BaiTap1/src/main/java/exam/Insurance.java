package Exam;

/**
 * This class represents Insurance object.
 * Insurance has the following properties: id, category, duration, price
 *
 */
import java.text.NumberFormat;
import java.util.Locale;


public class Insurance
{
    private String id;
    private String category;
    private int category;
    private double price;

    // constructors
    public Insurance()
    {
        this("", "", 0, 0.0);
    }

    public Insurance(String id, String category, int duration, double price)
    {
        this.id = id;
        this.category = category;
        this.duration = duration;
        this.price = price;
    }

    // getter and setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String getFormattedPrice()
    {
        NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);
        return currency.format(price);
    }
}
