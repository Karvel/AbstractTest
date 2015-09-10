/*
 Elanna Grossman
 Application that uses an abstract class to draw mathematical functions from derived classes. 
 */

import java.awt.*;
import javax.swing.*;

public class AbstractTest extends JFrame
{
    public AbstractTest()
    {
        getContentPane().setLayout(new GridLayout(2, 2, 0, 0));
        getContentPane().add(new funcSq());
        getContentPane().add(new funcSin());
        getContentPane().add(new funcCos());
        getContentPane().add(new funcTan());
        getContentPane().add(new funcCos5Sin());
        getContentPane().add(new func5CosSin());
        getContentPane().add(new funcLogSq());
    }//end AbstractTest
    
    public static void main(String[] args)
    {
        AbstractTest frame = new AbstractTest();
        frame.setSize(1500, 1500);
        frame.setTitle("AbstractTest");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }//end main
}//end AbstractTest