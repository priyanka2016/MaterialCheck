import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sai on 12/08/2015.
 */
public class TempratureTest {

    @Test
    public void isTempratureEqual()
    {
        Assert.assertTrue(Temperature.checkIsEqual(new Celcius(100),new Fareinheit(212)));
    }

    @Test
    public void checkIfTempratureNotEqual()
    {
        Assert.assertFalse(Temperature.checkIsEqual(new Celcius(10), new Fareinheit(212)));
    }

    @Test
    public void shouldConvertToCelcuis()
    {
        Temperature farenheit=new Fareinheit(32);
        Assert.assertEquals(0.0, new Celcius().convertTo(farenheit).getValue(),0.1);
    }
}
