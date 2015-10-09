import greenfoot.*;

/**
 * Write a description of class Enemy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy2 extends Enemy
{
    /**
     * Act - do whatever the Enemy2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int counter;
    public Enemy2()
    {
        counter = 0;
    }
    public void act() 
    {
        if(counter < 30)
        {
            move(-2);
            counter++;
        }
        else
        {
            move(2);
            counter++;
            if( counter == 60 )
                counter = 0;
        }
        if( isTouching(Laser.class) )
        {
            removeTouching(LaserRight.class);
            removeTouching(LaserLeft.class);
            getWorld().removeObject(this);
        }
    }     
}
