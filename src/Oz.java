/**
 * Created by sai on 11/08/2015.
 */
public class Oz extends Volume {


    private static final double CONVERSION_FACTOR=6;

    public Oz()
    {

    }
    @Override
    public  double getConversionFactor() {
        return CONVERSION_FACTOR;
    }

    @Override
    public Volume clone(double value) {
        return new Oz(value);
    }

    public Oz(double value) {
        super(value);
    }

    @Override
    public Volume convertToBase() {
        return new Tsp(this.getValue()*CONVERSION_FACTOR);
    }
}
