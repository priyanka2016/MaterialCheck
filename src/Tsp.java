/**
 * Created by sai on 11/08/2015.
 */
public class Tsp extends Volume {

    private static final double CONVERSION_FACTOR=1;

    public Tsp()
    {

    }
    public Tsp(double value) {
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
        return new Tsp(value);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tsp tsp = (Tsp) o;
        return Double.compare(tsp.getValue(), getValue()) == 0;

    }
}
