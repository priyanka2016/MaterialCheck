/**
 * Created by sai on 10/08/2015.
 */
public class Meter implements Length{


    private double value;
    private static final double CONVERSION_FACTOR=100;

    public Meter()
    {

    }
    public Meter(double value) {
        this.value = value;

    }

    public double getValue() {
        return value;
    }

    @Override
    public Centimeter convertToCentimeter() {
        Centimeter l=new Centimeter(value*CONVERSION_FACTOR);
        return l;
    }

    @Override
    public Meter convertTo(Length fromLength) {
        Centimeter cm=fromLength.convertToCentimeter();
        return new Meter(cm.getValue()/CONVERSION_FACTOR);
    }


}
