import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class angleText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class angleText extends Actor
{
    /**
     * Act - do whatever the angleText wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    double angle = 0;
    public angleText(){
        
    }
    public void act()
    {
        GreenfootImage text = new GreenfootImage(65,30);
        setImage(text);
        text.setColor(Color.BLACK);
        text.drawString("angle"+angle, 0, 10);
    }
    public void updateAngle(double newAngle){
        angle = newAngle;
    }
}
