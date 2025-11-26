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
    int buffer=0;
    public Ball(int newPower, int newAngle){
        getImage().scale(getImage().getWidth()/3, getImage().getHeight()/3);
        power = newPower;
        angle = Math.toRadians(newAngle);
        //Starting velocities
        if(angle>=0){
            vVel=-power*Math.sin(angle)*0.5;
        }
        else if(angle<0){
            vVel=-power*Math.sin(angle)*0.5;
        }
        if(angle>=0){
            hVel=power*Math.cos(angle)*0.5;
        }
        else if(angle<0){
            hVel=power*Math.cos(angle)*0.5;
        }
        
    }
    public void act(){
        int radius = radius = getImage().getWidth()/2;
        //Gravity
        buffer--;
        vVel+=4.9;
        int x=100;
        //Sets baseline for testing possible next x/y
        double nextX = getX();
        double nextY = getY();
        //Finds which velocity is greater and then uses that to find how small each test increment is
        double z = Math.ceil(Math.max(Math.abs(hVel), Math.abs(vVel)));
        double stepX = hVel / z;
        double stepY = vVel / z;
        for (int i = 0; i < z; i++) {
            //Checks each location by adding the "step" onto the last possible location with no collison
            double testX = nextX + stepX;
            double testY = nextY + stepY;
            setLocation((int)testX, (int)testY);
            if (isTouching(Obstacle.class)) {
                Obstacle obstacle = (Obstacle)getOneIntersectingObject(Obstacle.class);
                //Sets back by the amount it moved to collide
                if(buffer <1){
                    //setLocation((int)testX-(int)stepX, (int)testY-(int)stepY);
                    obstacle.whenHit(this);
                    buffer=5;
                    break;
                }
            } 
            else {
                nextX = testX;
                nextY = testY;
            }
        }
        updateText();
        delete();
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
    public double getAngle(){
        return Math.toDegrees((Math.atan(Math.toRadians(vVel)/Math.toRadians(hVel))));
    }
    public void updateText(){
        //Sets stat sliders
        Stages world = (Stages)getWorld();;
        vText vText = world.getvText();
        hText hText = world.gethText();
        //Finds angle
        angleText aText = world.getangleT();
        aText.updateAngle(Math.toDegrees((Math.atan(Math.toRadians(vVel)/Math.toRadians(hVel)))));
        hText.updatehVel(hVel);
        vText.updatevVel(vVel);
    }
    public void delete(){
        if(getX()>=599 || getX()<=1 ||getY()<=1 || getY()>=399){
            getWorld().removeObject(this);
        }
    }
}
