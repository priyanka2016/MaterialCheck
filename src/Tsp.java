/**
 * Created by sai on 11/08/2015.
 */
public class Tsp extends Volume {

    private double value;

    public Tsp(double value) {
        this.value = value;
    }

    @Override
    public double getValue() {

        return value;
    }

    public Tsp()
    {

    }

    @Override
    public Tsp convertToTsp() {
        return this;
    }

    @Override
    public Volume convertTo(Volume fromVolume) {
        Tsp tsp=fromVolume.convertToTsp();
        return tsp;
    }

    @Override
    public Volume addVolume(Volume volumeToBeAdded) {
        return new Tsp(this.convertTo(volumeToBeAdded).getValue()+this.getValue());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tsp tsp = (Tsp) o;

        return Double.compare(tsp.value, value) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(value);
        return (int) (temp ^ (temp >>> 32));
    }
}
