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
        Assert.assertFalse(Material.compareMaterial(new Centimeter(100),new Meter(2)));
    }

}