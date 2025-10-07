import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pText extends Actor
{
    /**
     * Act - do whatever the pText wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int power = 0;
    public pText(){
        
    }
    public void act()
    {
        MyWorld world = (MyWorld)getWorld();
        power= world.getpSlider().getPower();
        GreenfootImage text = new GreenfootImage(65,30);
        setImage(text);
        text.setColor(Color.BLACK);
        text.drawString("Power: "+power, 0, 10);
    }
}
