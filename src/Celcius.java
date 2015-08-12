/**
 * Created by sai on 12/08/2015.
 */
public class Celcius extends Temperature {

    private double value;

    public Celcius()
    {

    }
    public Celcius(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public Temperature convertToBase() {
        return new Celcius(this.value);
    }

    @Override
    public Temperature convertTo(Temperature fromTemprature) {
        Temperature temperature=fromTemprature.convertToBase();
        return new Celcius(temperature.getValue());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Celcius celcius = (Celcius) o;

        return Double.compare(celcius.value, value) == 0;

    }

}
