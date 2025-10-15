import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class vText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class vText extends Actor
{
    double vVel = 0;
    public vText(){
        
    }
    public void act()
    {
        GreenfootImage text = new GreenfootImage(65,30);
        setImage(text);
        text.setColor(Color.BLACK);
        text.drawString("vVel"+vVel, 0, 10);
    }
    public void updatevVel(double newvVel){
        vVel = newvVel;
    }
}
