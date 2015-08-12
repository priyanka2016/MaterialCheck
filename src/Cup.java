/**
 * Created by sai on 11/08/2015.
 */
public class Cup extends Volume{


    private static final double CONVERSION_FACTOR=48;


    public Cup()
    {

    }
    public Cup(double value) {
        super(value);
    }

    @Override
    public Volume convertToBase() {
        return new Tsp(this.getValue()*CONVERSION_FACTOR);
    }

    @Override
    public  double getConversionFactor() {
        return CONVERSION_FACTOR;
    }

    @Override
    public Volume clone(double value) {
        return new Cup(value);
    }
}
