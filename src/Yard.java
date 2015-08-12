/**
 * Created by sai on 11/08/2015.
 */
public class Yard extends Length{


    public static final double CONVERSION_FACTOR=100;

    public Yard()
    {

    }
    public Yard(double value) {
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
        return new Yard(value);
    }


}
