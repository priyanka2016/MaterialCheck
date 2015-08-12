/**
 * Created by sai on 12/08/2015.
 */
public class Fareinheit extends Temperature {

    private double value;

    public Fareinheit()
    {

    }
    public Fareinheit(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public Temperature convertToBase() {
        return new Celcius((this.value-32)*5/9);
    }

    @Override
    public Temperature convertTo(Temperature fromTemprature) {
        Temperature temperature=fromTemprature.convertToBase();
        return new Fareinheit(9/5*(temperature.getValue())+32);
    }
}
