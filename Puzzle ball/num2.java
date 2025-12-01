import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class num2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class num2 extends Stagenumbers
{
    /**
     * Act - do whatever the num2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage text = new GreenfootImage(65,30);
        setImage(text);
        MyWorld world = (MyWorld)getWorld();
        if(world.getwin2()){
            text.setColor(Color.GREEN);
        }
        else{
           text.setColor(Color.BLACK); 
        }
        text.drawString("2", 30,30);
    }
}
