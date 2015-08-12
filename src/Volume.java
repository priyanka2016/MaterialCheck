/**
 * Created by sai on 11/08/2015.
 */
public abstract class Volume implements Quantity {

    public abstract Tsp convertToTsp();
    public abstract Volume convertTo(Volume fromVolume);
    public abstract Volume addVolume(Volume volumeToBeAdded);

    public static boolean compareVolume(Volume v1,Volume v2)
    {
        if(v1.convertToTsp().equals(v1.convertToTsp()))
        {
            return true;
        }
        return false;
    }
}
