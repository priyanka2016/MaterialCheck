/**
 * Created by sai on 11/08/2015.
 */
public class Tbsp extends Volume {

    private double value;
    private static final double CONVERSION_FACTOR=3;

    public Tbsp(double value) {
        this.value = value;
    }

    public Tbsp()
    {

    }
    @Override
    public double getValue() {
        return value;
    }

    @Override
    public Tsp convertToTsp() {
        Tsp v=new Tsp(value*CONVERSION_FACTOR);
        return v;
    }

    @Override
    public Volume convertTo(Volume fromVolume) {
        Tsp tsp=fromVolume.convertToTsp();
        return new Tbsp(tsp.getValue()/CONVERSION_FACTOR);
    }

    @Override
    public Volume addVolume(Volume volumeToBeAdded) {
        return new Tbsp(this.convertTo(volumeToBeAdded).getValue()+this.getValue());
    }
}
