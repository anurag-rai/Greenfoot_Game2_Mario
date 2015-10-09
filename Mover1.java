import greenfoot.*;

/**
 * Write a description of class Mover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mover1 extends Objects
{
    /**
     * Act - do whatever the Mover wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int counter = 0;
    public void act() 
    {
        if(counter < 40)
        {
            move(4);
            counter++;
        }
        else
        {
            move(-4);
            counter++;
            if( counter == 80 )
                counter = 0;
        }
    }    
}
