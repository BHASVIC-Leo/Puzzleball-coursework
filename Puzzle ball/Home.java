import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Home here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Home extends Actor
{
    /**
     * Act - do whatever the Home wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {   
        //Creates a home world, passing win states
        Stages world = (Stages)getWorld();
           MyWorld home = new MyWorld(world.getwin1(), world.getwin2(), world.getwin3());
           if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(home);
        }
    }
}
