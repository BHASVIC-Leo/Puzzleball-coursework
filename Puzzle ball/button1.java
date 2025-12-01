import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class button1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class button1 extends SelectButton
{
    /**
     * Act - do whatever the button1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public button1(){
        getImage().scale(getImage().getWidth()/3, getImage().getHeight()/3);
    }
    public void select(){
        MyWorld world = (MyWorld)getWorld();
        Stages stage1 = new Stage1(world.getwin1(), world.getwin2(), world.getwin3());
        Greenfoot.setWorld(stage1);
    }
}
