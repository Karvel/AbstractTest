/*
 Elanna Grossman
 Application that uses an abstract class to draw mathematical functions from derived classes. 
 */

public class funcLogSq extends AbstractDrawFunction
{
    public double f(double x)
    {
        double pad = 0.01;
        return (50 * Math.log((x / 100.0) * 2 * Math.PI)) + (pad * x * x);
    }//end f
}//end funcLogSq