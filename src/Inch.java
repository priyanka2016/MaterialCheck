/**
 * Created by sai on 11/08/2015.
 */
public class Inch implements Length{

    private double value;

    public static final double CONVERSION_FACTOR=100;

    public Inch()
    {

    }
    public Inch(double value) {
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
    public Inch convertTo(Length fromLength) {
        Centimeter cm=fromLength.convertToCentimeter();
        return new Inch(cm.getValue()/CONVERSION_FACTOR);
    }
}
