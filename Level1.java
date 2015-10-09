import greenfoot.*;

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{

    /**
     * Constructor for objects of class Level1.
     * 
     */
    Counter counter;
    public Level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       
        super(1100, 600, 1); 
        counter = new Counter();
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {

        Brick brick = new Brick();
        addObject(brick, 193, 538);
        brick.setLocation(179, 532);
        Brick brick2 = new Brick();
        addObject(brick2, 335, 419);
        brick2.setLocation(332, 426);
        Person person = new Person(1);
        addObject(person, 29, 572);
        person.setLocation(22, 565);
        Ground ground = new Ground();
        addObject(ground, 733, 277);
        ground.setLocation(733, 277);
        ground.setLocation(733, 277);
        ground.setLocation(733, 277);
        ground.setLocation(733, 277);
        ground.setLocation(733, 277);
        ground.setLocation(733, 277);
        ground.setLocation(733, 277);
        ground.setLocation(733, 277);
        ground.setLocation(733, 277);
        ground.setLocation(733, 277);
        ground.setLocation(733, 277);
        ground.setLocation(733, 277);
        ground.setLocation(733, 277);
        ground.setLocation(733, 277);
        ground.setLocation(733, 277);
        ground.setLocation(733, 277);
        ground.setLocation(733, 277);
        ground.setLocation(733, 277);
        ground.setLocation(733, 277);
        ground.setLocation(733, 277);
        ground.setLocation(733, 277);
        ground.setLocation(799, 591);
        Mover1 mover1 = new Mover1();
        addObject(mover1, 519, 300);
        Mover2 mover2 = new Mover2();
        addObject(mover2, 767, 390);
        Stable stable = new Stable();
        addObject(stable, 964, 83);
        mover2.setLocation(808, 174);
        Brick brick3 = new Brick();
        addObject(brick3, 1139, 152);
        Enemy1 enemy1 = new Enemy1();
        addObject(enemy1, 453, 277);
        enemy1.setLocation(445, 271);
        enemy1.setLocation(687, 145);
        enemy1.setLocation(724, 145);
        Enemy2 enemy2 = new Enemy2();
        addObject(enemy2, 606, 277);
        enemy2.setLocation(595, 271);
        EndPoint endpoint = new EndPoint();
        addObject(endpoint, 1179, 82);
        endpoint.setLocation(1175, 78);
        brick.setLocation(129, 534);
        brick2.setLocation(305, 427);
        mover1.setLocation(468, 301);
        enemy2.setLocation(550, 271);
        mover2.setLocation(753, 179);
        enemy1.setLocation(789, 151);
        stable.setLocation(916, 84);
        brick3.setLocation(1045, 152);
        endpoint.setLocation(1079, 78);
        stable.setLocation(912, 58);
        enemy1.setLocation(678, 150);
        
        addObject(counter, 27, 28);
        counter.setLocation(80, 21);
    }
    public Counter getCounter()
    {
        return counter;
    }
}
