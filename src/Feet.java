/**
 * Created by sai on 11/08/2015.
 */
public class Feet implements Length {

    private double value;
    public static final double CONVERSION_FACTOR=100;


    public Feet()
    {

    }
    public Feet(double value) {
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
    public Feet convertTo(Length fromLength) {
        Centimeter cm=fromLength.convertToCentimeter();
        return new Feet(cm.getValue()/CONVERSION_FACTOR);
    }
}
