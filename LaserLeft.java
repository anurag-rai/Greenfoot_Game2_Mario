import greenfoot.*;

/**
 * Write a description of class LaserLeft here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LaserLeft extends Laser
{
    /**
     * Act - do whatever the LaserLeft wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-8);
        if(isTouching(Objects.class))
        {
            getWorld().removeObject(this);    
        }
        else if(isAtEdge())
        {
            getWorld().removeObject(this);    
        } 
    }    
}
