/**
 * Created by sai on 10/08/2015.
 */
public class Material {

    public static boolean compareMaterial(Length cm,Length m)
    {
        if(m.convertToBase().equals(cm.convertToBase()))
        {
            return true;
        }
        return false;
    }

    public static Length addMaterial(Length first,Length second)
    {
       return first.addLength(second);
    }
}
