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
        //Set angle of the cannon
        int angle = aSlider.getAngle();
        setRotation(-angle);
    }
    public void fire(){
        boolean fired = false;
        MyWorld world = (MyWorld)getWorld();
        aSlider aSlider = world.getaSlider();
        pSlider pSlider = world.getpSlider();
        Ball ball = new Ball(pSlider.getPower(), aSlider.getAngle());
        world.addObject(ball, this.getX(), this.getY());
        if (!fired){
            ball.setRotation(getRotation());
            fired = true;
        }
    }
}
