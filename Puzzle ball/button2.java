import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class button2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class button2 extends SelectButton
{
    /**
     * Act - do whatever the button2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public button2(){
        getImage().scale(getImage().getWidth()/3, getImage().getHeight()/3);
    }
    public void select(){
        Stages stage2 = new Stage2();
        Greenfoot.setWorld(stage2);
    }
}
