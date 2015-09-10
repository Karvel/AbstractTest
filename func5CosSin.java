/*
 Elanna Grossman
 Application that uses an abstract class to draw mathematical functions from derived classes. 
 */

public class func5CosSin extends AbstractDrawFunction
{
    public double f(double x)
    {
        return (250 * Math.cos((x / 100.0) * 2 * Math.PI)) + (50 * Math.sin((x / 100.0) * 2 * Math.PI));
    }//end f
}//end func5CosSin