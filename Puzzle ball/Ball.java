import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    double vVel=0;
    double hVel=0;
    public Ball(){
        getImage().scale(getImage().getWidth()/3, getImage().getHeight()/3);
    }
    public void act()
    {
        MyWorld world = (MyWorld)getWorld();
        pSlider pSlider = world.getpSlider();
        int power = pSlider.getPower();
        resolvehVel();
        resolvevVel();
        setLocation(getX()+(int)hVel,getY()-(int)vVel);
    }
    public void resolvehVel(){
        MyWorld world = (MyWorld)getWorld();
        pSlider pSlider = world.getpSlider();
        aSlider aSlider = world.getaSlider();
        int angle = aSlider.getAngle();
        int power = pSlider.getPower();
        if(getRotation()>=0){
            hVel=power*Math.cos(angle);
        }
        else if(getRotation()<0){
            hVel=power*Math.sin(-angle);
        }
    }
    public void resolvevVel(){
        MyWorld world = (MyWorld)getWorld();
        aSlider aSlider = world.getaSlider();
        int angle = aSlider.getAngle();
        pSlider pSlider = world.getpSlider();
        int power = pSlider.getPower();
        if(getRotation()>=0){
            vVel=power*Math.sin(angle);
        }
        else if(getRotation()<0){
            vVel=power*Math.cos(-angle);
        }
        vVel=vVel-(9.81/60);
    }
}
