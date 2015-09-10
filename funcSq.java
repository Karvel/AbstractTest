/*
 Elanna Grossman
 Application that uses an abstract class to draw mathematical functions from derived classes. 
 */

public class funcSq extends AbstractDrawFunction
{
    public double f(double x)
    {
        double pad = 0.01;
        return pad * x * x;
    }//end f
}//end funcSq