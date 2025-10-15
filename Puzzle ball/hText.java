import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hText extends Actor
{
    /**
     * Act - do whatever the hText wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    double hVel = 0;
    public hText(){
        
    }
    public void act()
    {
        GreenfootImage text = new GreenfootImage(65,30);
        setImage(text);
        text.setColor(Color.BLACK);
        text.drawString("hVel"+hVel, 0, 10);
    }
    public void updatehVel(double newhVel){
        hVel = newhVel;
    }
}
