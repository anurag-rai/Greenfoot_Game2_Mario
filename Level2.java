import greenfoot.*;

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{

    /**
     * Constructor for objects of class Level2.
     * 
     */
    Counter counter;
    public Level2()
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
        Ground ground2 = new Ground();
        addObject(ground2, 782, 347);
        ground2.setLocation(731, 595);
        Person person = new Person(2);
        addObject(person,29, 572);
        Mover1 mover1 = new Mover1();
        addObject(mover1, 158, 491);
        Mover2 mover2 = new Mover2();
        addObject(mover2, 423, 378);
        Mover1 mover12 = new Mover1();
        addObject(mover12, 165, 275);
        Mover2 mover22 = new Mover2();
        addObject(mover22, 430, 142);
        Stable stable = new Stable();
        addObject(stable, 667, 84);
        Mover1 mover13 = new Mover1();
        addObject(mover13, 805, 208);
        Brick brick = new Brick();
        addObject(brick, 1052, 356);
        EndPoint endpoint = new EndPoint();
        addObject(endpoint, 1054, 249);
        endpoint.setLocation(1079, 281);
        Enemy1 enemy1 = new Enemy1();
        addObject(enemy1, 98, 467);
        enemy1.setLocation(97, 462);
        enemy1.setLocation(96, 460);
        Enemy1 enemy12 = new Enemy1();
        addObject(enemy12, 105, 249);
        enemy12.setLocation(101, 244);
        Enemy2 enemy2 = new Enemy2();
        addObject(enemy2, 486, 353);
        enemy2.setLocation(477, 346);
        Enemy2 enemy22 = new Enemy2();
        addObject(enemy22, 480, 116);
        enemy22.setLocation(478, 112);
        Enemy1 enemy13 = new Enemy1();
        addObject(enemy13, 619, 57);
        Enemy2 enemy23 = new Enemy2();
        addObject(enemy23, 876, 186);
        enemy23.setLocation(874, 174);
        enemy23.setLocation(874, 175);
        enemy23.setLocation(874, 177);
        enemy13.setLocation(617, 53);
        enemy23.setLocation(878, 177);
        enemy1.setLocation(449, 304);
        enemy2.setLocation(226, 459);
        enemy1.setLocation(355, 347);
        enemy12.setLocation(342, 84);
        enemy22.setLocation(235, 245);
        enemy12.setLocation(353, 110);
        addObject(counter, 52, 31);
        counter.setLocation(86, 25);
    }
     public Counter getCounter()
    {
        return counter;
    }  
}
