/**
 * Created by sai on 10/08/2015.
 */
public class Meter implements Length{


    private double value;
    public static final int CONVERSION_FACTOR=100;

    public Meter(double value) {
        this.value = value;

    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
