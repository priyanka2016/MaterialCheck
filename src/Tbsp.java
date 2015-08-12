/**
 * Created by sai on 11/08/2015.
 */
public class Tbsp extends Volume {


    private static final double CONVERSION_FACTOR=3;

    public Tbsp()
    {

    }
    public Tbsp(double value) {
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
        return new Tbsp(value);
    }
}
