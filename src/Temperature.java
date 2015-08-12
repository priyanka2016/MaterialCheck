/**
 * Created by sai on 12/08/2015.
 */
public abstract class Temperature {

    public abstract double getValue();
    public abstract Temperature convertToBase();
    public abstract Temperature convertTo(Temperature fromTemprature);

    public Temperature() {
    }

    public static boolean checkIsEqual(Temperature t1,Temperature t2)
 {
     if(t1.convertToBase().equals(t2.convertToBase()))
     {
         return true;
     }
     return false;
 }

}
