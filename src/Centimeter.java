/**
 * Created by sai on 10/08/2015.
 */
public class Centimeter implements Length {

    private double value;

    public Centimeter()
    {

    }

    public double getValue() {
        return value;
    }

    public Centimeter(double value) {
        this.value = value;
    }

    @Override
    public Centimeter convertToCentimeter() {
        return this;
    }

    @Override
    public Centimeter convertTo(Length fromLength) {
        Centimeter cm=fromLength.convertToCentimeter();
        return cm;
    }

    @Override
    public Length addLength(Length lengthToBeAdded) {

        return new Centimeter(this.convertTo(lengthToBeAdded).getValue()+this.getValue());

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Centimeter that = (Centimeter) o;

        return Double.compare(that.value, value) == 0;

    }


}
