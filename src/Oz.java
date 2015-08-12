/**
 * Created by sai on 11/08/2015.
 */
public class Oz extends Volume {

    private double value;
    private static final double CONVERSION_FACTOR=6;

    public Oz(double value) {
        this.value = value;
    }

    @Override
    public double getValue() {
        return value;
    }

    public Oz()
    {

    }

    @Override
    public Tsp convertToTsp() {
        Tsp v=new Tsp(value*CONVERSION_FACTOR);
        return v;
    }

    @Override
    public Volume convertTo(Volume fromVolume) {
        Tsp tsp=fromVolume.convertToTsp();
        return new Oz(tsp.getValue()/CONVERSION_FACTOR);
    }

    @Override
    public Volume addVolume(Volume volumeToBeAdded) {
        return new Oz(this.convertTo(volumeToBeAdded).getValue()+this.getValue());
    }
}
