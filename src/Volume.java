/**
 * Created by sai on 11/08/2015.
 */
public abstract class Volume  {

    private double value;

    public Volume()
    {

    }
    public Volume(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public abstract Volume convertToBase();

    public abstract double getConversionFactor();

    public Volume convertTo(Volume fromVolume) {
        Volume cm=fromVolume.convertToBase();
        return this.clone(cm.getValue()/this.getConversionFactor());
    }

    public Volume addVolume(Volume volumeToBeAdded) {
        return this.clone(this.convertTo(volumeToBeAdded).getValue() + this.getValue());
    }



    public abstract Volume clone(double value);


    public static boolean compareVolume(Volume v1,Volume v2)
    {
        if(v1.convertToBase().equals(v2.convertToBase()))
        {
            return true;
        }

        return false;
    }




}
