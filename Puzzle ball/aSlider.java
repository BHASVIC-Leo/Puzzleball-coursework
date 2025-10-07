import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class aSlider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class aSlider extends Actor
{
    /**
     * Act - do whatever the aSlider wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int width = 100;
    int height = 10;
    int angle=0;
    public aSlider(){
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
        aHead head = world.getaHead();
        //Power equation(placeholder)
        angle = (head.getX()-538)*2;
    }
    public void setOthers(){
        MyWorld world = (MyWorld)getWorld();
        world.getaText().setLocation(this.getX()+10,this.getY()-20);
    }
    public int getAngle(){
        return angle;
    }
}
