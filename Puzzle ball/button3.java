import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class button3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class button3 extends SelectButton
{
    /**
     * Act - do whatever the button3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public button3(){
        getImage().scale(getImage().getWidth()/3, getImage().getHeight()/3);
    }
    public void select(){
        MyWorld world = (MyWorld)getWorld();
        Stages stage3 = new Stage3(world.getwin1(), world.getwin2(), world.getwin3());
        Greenfoot.setWorld(stage3);
    }
}
