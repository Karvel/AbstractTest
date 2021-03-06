/*
 Elanna Grossman
 Application that uses an abstract class to draw mathematical functions from derived classes. 
 */

public class funcCos5Sin extends AbstractDrawFunction
{
    public double f(double x)
    {
        return (50 * Math.cos((x / 100.0) * 2 * Math.PI)) + (250 * Math.sin((x / 100.0) * 2 * Math.PI));
    }//end f
}//end funcCos5Sin