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
    int power;
    double angle;
    public Ball(int newPower, int newAngle){
        getImage().scale(getImage().getWidth()/3, getImage().getHeight()/3);
        power = newPower;
        angle = Math.toRadians(newAngle);
        //Starting velocities
        if(angle>=0){
            vVel=power*Math.sin(angle);
        }
        else if(angle<0){
            vVel=power*Math.sin(angle);
        }
        if(angle>=0){
            hVel=power*Math.cos(angle)/0.7;
        }
        else if(angle<0){
            hVel=power*Math.cos(angle)/0.7;
        }
        
    }
    public void act()
    {
        resolvehVel();
        resolvevVel();
        setLocation(getX()+(int)hVel,getY()-(int)vVel);
        updateText();
        delete();
    }
    public void resolvehVel(){
      
    }
    public void resolvevVel(){
        vVel=vVel-(9.8);
    }
    public double getvVel(){
        return vVel;
    }
    public double gethVel(){
        return hVel;
    }
    public void updatehVel(double newhVel){
        hVel = newhVel;
    }
    public void updatevVel(double newvVel){
        vVel = newvVel;
    }
    public int returnX(){
        return getX();
    }
    public int returnY(){
        return getY();
    }
    public void updateText(){
        //Sets stat sliders
        MyWorld world = (MyWorld)getWorld();
        vText vText = world.getvText();
        hText hText = world.gethText();
        hText.updatehVel(hVel);
        vText.updatevVel(vVel);
    }
    public void delete(){
        if(getX()>=599 || getX()<=1 ||getY()<=1 || getY()>=399){
            getWorld().removeObject(this);
        }
    }
}
