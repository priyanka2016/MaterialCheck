/**
 * Created by sai on 11/08/2015.
 */
public class Yard implements Length{

    private double value;
    public static final double CONVERSION_FACTOR=100;

    public double getValue() {
        return value;
    }

    @Override
    public Centimeter convertToCentimeter() {
        Centimeter cm=new Centimeter(value*CONVERSION_FACTOR);
        return cm;
    }

    @Override
    public Yard convertTo(Length fromLength) {
        Centimeter cm=fromLength.convertToCentimeter();
        return new Yard(cm.getValue()/CONVERSION_FACTOR);
    }

    public Yard()
    {

    }

    public Yard(double value) {
        this.value = value;
    }
}
