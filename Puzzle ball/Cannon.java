import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cannon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cannon extends Actor
{
    /**
     * Act - do whatever the Cannon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Cannon(){
        getImage().scale(getImage().getWidth()/8, getImage().getHeight()/8);
    }
    public void act()
    {
        //Get needed objects
          MyWorld world = (MyWorld)getWorld();
        aSlider aSlider = world.getaSlider();
        pSlider pSlider = world.getpSlider();
        //Set angle of the cannon
        int angle = aSlider.getAngle();
        setRotation(-angle);
        //Set power
        int power = pSlider.getPower();
    }
    public void fire(){
        MyWorld world = (MyWorld)getWorld();
        Ball ball = new Ball();
        world.addObject(ball, this.getX(), this.getY());
        ball.setRotation(getRotation());
    }
}
