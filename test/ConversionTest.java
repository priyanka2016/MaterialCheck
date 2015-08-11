import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertThat;

/**
 * Created by sai on 11/08/2015.
 */
public class ConversionTest {


    @Test
    public void shouldConvertToInch()
    {
        Length yard=new Yard(12);
        Assert.assertEquals(12.0, new Inch().convertTo(yard).getValue(),0.1);
    }

    @Test
    public void checkIfNotConvertToInch()
    {
        Length yard=new Yard(12);
      /* assertNotEquals(13.0, new Inch().convertTo(yard).getValue(),0.1);*/
    }
    @Test
    public void shouldConvertToFeet()
    {
        Length yard=new Yard(12);
        Assert.assertEquals(true,new Feet().convertTo(yard) instanceof Feet);
    }

    @Test
    public void shouldConvertToMeter()
    {
        Length yard=new Yard(12);
        Assert.assertEquals(true,new Meter().convertTo(yard) instanceof Meter);
    }

    /*@Test
    public void shouldConvertToInch()
    {
        Length yard=new Yard(12);
        Assert.assertEquals(true,new Inch().convertTo(yard) instanceof Inch);
    }*/
}
