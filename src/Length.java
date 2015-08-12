/**
 * Created by sai on 10/08/2015.
 */
public interface Length extends Quantity {


    public Centimeter convertToCentimeter();
    public Length convertTo(Length fromLength);
    public Length addLength(Length lengthToBeAdded);


  }

