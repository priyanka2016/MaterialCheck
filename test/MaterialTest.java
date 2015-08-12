import org.junit.Assert;
import org.junit.Test;

public class MaterialTest {

    @Test
    public void checkIsMaterialEqual()
    {
        Assert.assertTrue(Material.compareMaterial(new Centimeter(100), new Meter(1)));
    }

    @Test
    public void checkIsMaterialNotEqual()
    {
        Assert.assertFalse(Material.compareMaterial(new Centimeter(100), new Meter(2)));
    }

    @Test
    public void shouldAddLength()
    {
        Length cm=new Centimeter(100);
        Length m=new Meter(2);
        Assert.assertEquals(300.00,Material.addMaterial(cm,m).getValue(),0.1);
    }
    /*@Test
    public void checkIsInchToCentimeterConversionCorrect()
    {
        //Assert.assertFalse(Material.compareMaterial(new Centimeter(100), new Meter(2)));
    }

    @Test
    public void checkIsCentimeterToMeterConversionCorrect()
    {
        Centimeter cm=new Centimeter(10000);
        double expected=100;
        Assert.assertEquals(cm.convertToMeter(), expected);
    }*/

}