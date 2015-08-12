/**
 * Created by sai on 11/08/2015.
 */
public class Feet extends Length {

    public static final double CONVERSION_FACTOR=100;

    public Feet()
    {

    }
    public Feet(double value) {
        super(value);
    }

    public  double getConversionFactor() {
        return CONVERSION_FACTOR;
    }

    @Override
    public Length convertToBase() {
        return new Centimeter(this.getValue()*CONVERSION_FACTOR);
    }

    @Override
    public Length clone(double value) {
        return new Feet(value);
    }
}
