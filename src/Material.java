/**
 * Created by sai on 10/08/2015.
 */
public class Material {

    public static boolean compareMaterial(Length cm,Length m)
    {
        if(m.getValue()*Meter.CONVERSION_FACTOR==cm.getValue())
        {
            return true;
        }
        return false;
    }
}
