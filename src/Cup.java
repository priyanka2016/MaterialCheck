/**
 * Created by sai on 11/08/2015.
 */
public class Cup extends Volume{

    private double value;
    private static final double CONVERSION_FACTOR=48;

    public Cup(double value) {
        this.value = value;
    }

    @Override
    public double getValue() {
        return value;
    }

    public Cup()
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
        return new Cup(tsp.getValue()/CONVERSION_FACTOR);
    }

    @Override
    public Volume addVolume(Volume volumeToBeAdded) {
        return new Cup(this.convertTo(volumeToBeAdded).getValue()+this.getValue());
    }
}
