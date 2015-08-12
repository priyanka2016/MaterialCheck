/**
 * Created by sai on 11/08/2015.
 */
public class Inch extends Length{


    public static final double CONVERSION_FACTOR=100;

    public Inch()
    {

    }
    public Inch(double value) {
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
        return new Inch(value);
    }


}
