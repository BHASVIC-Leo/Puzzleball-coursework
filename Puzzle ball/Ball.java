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
            vVel=power*Math.sin(angle)*0.5;
        }
        else if(angle<0){
            vVel=power*Math.sin(angle)*0.5;
        }
        if(angle>=0){
            hVel=power*Math.cos(angle)*0.5;
        }
        else if(angle<0){
            hVel=power*Math.cos(angle)*0.5;
        }
        
    }
    public void act()
    {
        resolvehVel();
        resolvevVel();
        int hOffset=0;
        boolean hFail=true;
        int vOffset=0;
        boolean vFail=true;
        //Check if about to collide with an object
        Obstacle obstacle = (Obstacle)getOneObjectAtOffset((int)hVel,(int)-(vVel),Obstacle.class);
        if(obstacle!=null){
            for(int i=1; i<=10; i++){
                //If from below
                if(getY()>obstacle.getY()+obstacle.getHeight()/2-1){
                    if(getOneObjectAtOffset((int)(hVel*i/10),(int)(vVel*i/10),Obstacle.class)!=null){
                        hOffset=(int)(hVel*i/10);
                        hFail=false;
                        vOffset=(int)(vVel*i/10);
                        vFail=false;
                    }
                }
                //If from above
                if(getY()<obstacle.getY()-obstacle.getHeight()/2+1){
                    if(getOneObjectAtOffset((int)(hVel*i/10),-(int)(vVel*i/10),Obstacle.class)!=null){
                        hOffset=(int)(hVel*i/10);
                        hFail=false;
                        vOffset=-(int)(vVel*i/10);
                        vFail=false;
                    }
                }
            }
            if(vFail=true&&getX()>=obstacle.getX()+obstacle.getWidth()/2&&getX()<=obstacle.getX()-obstacle.getWidth()/2){
                    setLocation(getX(),obstacle.getY()-obstacle.getHeight()+400-getY());
                    hVel=-hVel;
            }
            setLocation(getX()+hOffset,getY()-vOffset);
        }   
        else{
            setLocation(getX()+(int)hVel,getY()-(int)vVel);
        }
        updateText();
        delete();
    }
    public void resolvehVel(){
      
    }
    public void resolvevVel(){
        vVel=vVel-(4.9);
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
    public void updateText(){
        //Sets stat sliders
        Stages world = (Stages)getWorld();;
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
