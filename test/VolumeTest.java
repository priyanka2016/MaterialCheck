import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sai on 11/08/2015.
 */
public class VolumeTest {

    @Test
    public void isVolumeEqual()
    {
        Assert.assertTrue(Volume.compareVolume(new Oz(1),new Tbsp(2)));
    }

    @Test
    public void checkIfVolumeNotEqual()
    {
        Assert.assertFalse(Volume.compareVolume(new Oz(2),new Tbsp(2)));
    }

    @Test
    public void shouldAddVolume()
    {
        Volume v1=new Tbsp(1);
        Volume v2=new Oz(1);

        Assert.assertEquals(3.0, v1.addVolume(v2).getValue(), 0.1);
    }

    @Test
    public void shouldConvertToCup()
    {
        Volume oz=new Oz(8);
        Assert.assertEquals(1.0, new Cup().convertTo(oz).getValue(),0.1);
    }

    @Test
    public void shouldConvertToOz()
    {
        Volume tbsp=new Tbsp(2);
        Assert.assertEquals(true, new Oz().convertTo(tbsp) instanceof Oz);
    }

    @Test
    public void shouldConvertToTbsp()
    {
        Volume tsp=new Tsp(2);
        Assert.assertEquals(true, new Tbsp().convertTo(tsp) instanceof Tbsp);
    }


}
