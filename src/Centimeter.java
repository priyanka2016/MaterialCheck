/**
 * Created by sai on 10/08/2015.
 */
public class Centimeter extends Length {


    private static final double CONVERSION_FACTOR=1;

    public Centimeter()
    {

    }
    public Centimeter(double value) {
        super(value);
    }

    @Override
    public Length convertToBase() {
        return new Centimeter(this.getValue()*CONVERSION_FACTOR);
    }

    public double getConversionFactor() {
        return CONVERSION_FACTOR;
    }


    @Override
    public Length clone(double value) {
       return new Centimeter(value);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Centimeter centimeter = (Centimeter) o;

        return Double.compare(centimeter.getValue(), getValue()) == 0;

    }




}
