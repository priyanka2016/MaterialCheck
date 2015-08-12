/**
 * Created by sai on 10/08/2015.
 */
public abstract class Length  {

    private double value;

    public Length()
    {

    }
    public Length(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public abstract Length convertToBase();

    public abstract double getConversionFactor();

    public Length convertTo(Length fromLength) {
        Length cm=fromLength.convertToBase();
        return this.clone(cm.getValue()/this.getConversionFactor());
    }

    public Length addLength(Length lengthToBeAdded) {
        return this.clone(this.convertTo(lengthToBeAdded).getValue() + this.getValue());
    }

    public static boolean compareLength(Length cm,Length m)
    {
        if(m.convertToBase().equals(cm.convertToBase()))
        {
            return true;
        }
        return false;
    }



    public abstract Length clone(double value);


}

