/*
 Elanna Grossman
 Application that uses an abstract class to draw mathematical functions from derived classes. 
 */

import java.awt.*;
import javax.swing.*;

public abstract class AbstractDrawFunction extends JPanel
{
    //Create polygon object
    private Polygon p = new Polygon();
    
    protected AbstractDrawFunction()
    {
        drawFunction();
    }//end AbstractDrawFunction
    
    abstract double f(double x);
    
    //Create points for x coord
    public void drawFunction()
    {
        for (int x = -100; x <= 100; x++)
        {
            p.addPoint(x + 200, 200 - (int)f(x));
        }//end for   
    }//end drawFunction
    
    //Draw axes, arrows, labels & points
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        //Draw axes
        g.drawLine(60, 200, 340, 200);
        g.drawLine(200, 80, 200, 330);
        
        //Draw x arrow
        g.drawLine(340, 200, 320, 190);
        g.drawLine(340, 200, 320, 210);
        
        //Draw y arrow
        g.drawLine(200, 80, 190, 100);
        g.drawLine(200, 80, 210, 100);
        
        //Draw x, y, 0
        g.drawString("X", 320, 170);
        g.drawString("Y", 220, 90);
        g.drawString("0", 190, 215);
        
        //Draw points
        g.drawPolyline(p.xpoints, p.ypoints, p.npoints);
    }//end paintComponent
}//end AbstractDrawFunction
