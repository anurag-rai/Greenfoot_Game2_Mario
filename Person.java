import greenfoot.*;

/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person extends Actor
{
    /**
     * Act - do whatever the Person wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int v_speed;
    long lastTime;
    int life;
    int currentLevel;
    boolean jump;
    public Person(int level)
    {
        v_speed = 0;
        lastTime = 0L;
        life = 3;
        currentLevel = level;
        jump = false;
    }
    public void act() 
    {
        if ( (v_speed <0) && jump && isTouching(Objects.class) )
        {
            while(isTouching(Objects.class))
            {
                setLocation(getX(), getY() + 2);              
            }
            v_speed = 0;;
        }
        
        v_speed = v_speed + 1;
        if(isTouching(Objects.class))
        {
            v_speed = 0;
            jump = false;
            if(Greenfoot.isKeyDown("up"))
            {
                    v_speed = -16;
                    setLocation(getX(), getY() - 1);
                    jump = true;  
            }   
        }
        
        
        while(isTouching(Objects.class))
        {
            setLocation(getX(), getY() - 1);    
        }
        
        if(Greenfoot.isKeyDown("left"))
        {
           setLocation(getX() - 4, getY());
           while(isTouching(Objects.class))
           {
               move(1);    
           }
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + 4, getY());
            while(isTouching(Objects.class))
               move(-1);    
            
        }
         setLocation(getX(), getY() + v_speed);   
         if( isTouching(Enemy.class))
         {
             life -= 1;
             setLocation(29, 572);
             World w = getWorld();
             if ( currentLevel == 1)
             {
                 Level1 l1 = (Level1) w;
                 Counter c = l1.getCounter();
                 c.setScore(life);
             }
             if ( currentLevel == 2)
             {
                 Level2 l2 = (Level2) w;
                 Counter c = l2.getCounter();
                 c.setScore(life);
             }
             
             if ( life == 0 )
             {
                 w = getWorld();
                 w.addObject(new GameOver(), w.getWidth() / 2, w.getHeight() / 2);
                 Greenfoot.stop();
             }
               
         }
         if( Greenfoot.isKeyDown("d") )
         {
            if(System.currentTimeMillis() - lastTime > 500)
            {
                getWorld().addObject(new LaserRight(), getX(), getY()); 
                lastTime = System.currentTimeMillis();
            }
        }
        if( Greenfoot.isKeyDown("a") )
         {
            if(System.currentTimeMillis() - lastTime > 500)
            {
                getWorld().addObject(new LaserLeft(), getX(), getY()); 
                lastTime = System.currentTimeMillis();
            }
        }
        if(isTouching(EndPoint.class))
        {
            if ( currentLevel == 1 )
            {
                Greenfoot.setWorld( new Level2() );
            }
            if ( currentLevel ==2  )
            {
                 World w = getWorld();
                 w.addObject(new Complete(), w.getWidth() / 2, w.getHeight() / 2);
                 Greenfoot.stop();
            }
                
        }
    }    
    public int getSpeed()
    {return v_speed;}
    public boolean getJump()
    {return jump;}
    public int getLevel()
    {return currentLevel;}
    public int getLife()
    {return life;}
}
