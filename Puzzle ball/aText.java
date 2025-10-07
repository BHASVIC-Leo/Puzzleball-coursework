import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class aText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class aText extends Actor
{
    /**
     * Act - do whatever the aText wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int angle = 0;
    public aText(){
        
    }
    public void act()
    {
        MyWorld world = (MyWorld)getWorld();
        angle = world.getaSlider().getAngle();
        GreenfootImage text = new GreenfootImage(65,30);
        setImage(text);
        text.setColor(Color.BLACK);
        text.drawString("Angle: "+angle, 0, 10);
    }
}
