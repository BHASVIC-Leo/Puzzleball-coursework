import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootImage;

/**
 * Write a description of class Slider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pSlider extends Actor
{
    /**
     * Act - do whatever the Slider wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int width = 100;
    int height = 10;
    int power=0;
    public pSlider(){
        //Create slider
        GreenfootImage rect = new GreenfootImage(width,height);
        setImage(rect);
        rect.setColor(Color.BLACK);
        rect.drawRect(0,0,width-1,height-1);
        rect.setColor(Color.GRAY);
        rect.fillRect(1,1, width, height);
          
    }
    public void act()
    {
        setOthers();
        MyWorld world = (MyWorld)getWorld();
        pHead head = world.getpHead();
        //Power equation(placeholder)
        power = head.getX()-468;
    }
    public int getPower(){
        return power;
    }
    public void setOthers(){
        MyWorld world = (MyWorld)getWorld();
        world.getpText().setLocation(this.getX()+10,this.getY()-20);
    }
    
}
