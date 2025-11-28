import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flag here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flag extends Obstacle
{
    /**
     * Act - do whatever the Flag wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void whenHit(Ball ball){
        Stages world = (Stages)getWorld();
        Win win = new Win();
        world.addObject(win, 450, 200);
    }
}
