/**
 * Created by sai on 10/08/2015.
 */
public class Meter extends Length{

    private static final double CONVERSION_FACTOR=100;

    public Meter()
    {

    }
    public Meter(double value) {
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
        return new Meter(value);
    }


}
