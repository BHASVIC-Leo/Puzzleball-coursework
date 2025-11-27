import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Obstacle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obstacle extends Actor
{
    int height;
    int width;
    //Defualt value
    double bounce=1;
    boolean tests=false;
    Test test = new Test();
            Test test1 = new Test();
            Test test2 = new Test();
            Test test3 = new Test();
    int[][] corners = new int[4][2];
    public Obstacle(){
        
            }
    public void act()
    {
        corners();
    }
    public void whenHit(Ball ball){
        //Set as variables for easier reading
        //collision angle
        corners();
        double reflectionA;
        double cAngle;
        height = getImage().getHeight();
        width = getImage().getWidth();
        //Checks if colliding with left side
        if(
        ball.getX()<=(Math.max(corners[0][0], corners[2][0])+5)
        && ball.getX()>=(Math.min(corners[0][0], corners[2][0])-5) 
        && ball.getY()<=(Math.max(corners[0][1], corners[2][1])+5) 
        && ball.getY()>=(Math.min(corners[0][1], corners[2][1])-5)
        ){
            //Finds edge angle
            cAngle=Math.atan(Math.toRadians(corners[0][1]- corners[2][1])/Math.toRadians(corners[0][0]-corners[2][0]));
            //Find reflection angle
            reflectionA= 2* cAngle - ball.getAngle();
            //Uses angle to update velocities
            ball.updatehVel(Math.cos(reflectionA)*ball.getSpeed()*bounce);
            ball.updatevVel(Math.sin(reflectionA)*ball.getSpeed()*bounce);
        }
        //Checks if colliding with right side
        else if(
        ball.getX()<=(Math.max(corners[1][0], corners[3][0])+5)
        && ball.getX()>=(Math.min(corners[1][0], corners[3][0])-5) 
        && ball.getY()<=(Math.max(corners[1][1], corners[3][1])+5) 
        && ball.getY()>=(Math.min(corners[1][1], corners[3][1])-5)
        ){
            cAngle=Math.atan(Math.toRadians(corners[1][1]- corners[3][1])/Math.toRadians(corners[1][0]-corners[3][0]));
            reflectionA= 2* cAngle - ball.getAngle();
            ball.updatehVel(Math.cos(reflectionA)*ball.getSpeed()*bounce);
            ball.updatevVel(Math.sin(reflectionA)*ball.getSpeed()*bounce);
        }
        //Checks if colliding with top side
        else if(
        ball.getX()<=(Math.max(corners[0][0], corners[1][0])+5)
        && ball.getX()>=(Math.min(corners[0][0], corners[1][0])-5) 
        && ball.getY()<=(Math.max(corners[0][1], corners[1][1])+5) 
        && ball.getY()>=(Math.min(corners[0][1], corners[1][1])-5)
        ){
            cAngle=Math.atan(Math.toRadians(corners[0][1]- corners[1][1])/Math.toRadians(corners[0][0]-corners[1][0]));
            reflectionA= 2* cAngle - ball.getAngle();
            ball.updatehVel(Math.cos(reflectionA)*ball.getSpeed()*bounce);
            ball.updatevVel(Math.sin(reflectionA)*ball.getSpeed()*bounce);
        }
        //Checks if colliding with bottom side
        else if(
        ball.getX()<=(Math.max(corners[2][0], corners[3][0])+5)
        && ball.getX()>=(Math.min(corners[2][0], corners[3][0])-5) 
        && ball.getY()<=(Math.max(corners[2][1], corners[3][1])+5) 
        && ball.getY()>=(Math.min(corners[2][1], corners[3][1])-5)
        ){
            cAngle=Math.atan(Math.toRadians(corners[2][1]- corners[3][1])/Math.toRadians(corners[2][0]-corners[3][0]));
            reflectionA= 2* cAngle - ball.getAngle();
            ball.updatehVel(Math.cos(reflectionA)*ball.getSpeed()*bounce);
            ball.updatevVel(Math.sin(reflectionA)*ball.getSpeed()*bounce);
        }
        else{
            if(ball.getY()<=getY()-height/2+1||ball.getY()>=getY()+height/2-1){
                ball.updatevVel(-bounce*ball.getvVel());
            }
            else{
                ball.updatehVel(-bounce*ball.gethVel());
            }
        }
    }
    public void corners(){
        int rot=getRotation();
        int width = getImage().getWidth();
        int height = getImage().getHeight();
        corners = new int[4][2];
        //Corner 1 (top left)
        corners[0][0] = (int)(getX()+(-width/2*Math.cos(Math.toRadians(rot)))-(-height/2*Math.sin(Math.toRadians(rot))));
        corners[0][1] = (int)(getY()+(-width/2*Math.sin(Math.toRadians(rot)))+(-height/2*Math.cos(Math.toRadians(rot))));
        //Corner 2 (top right)
        corners[1][0] = (int)(getX()+(width/2*Math.cos(Math.toRadians(rot)))-(-height/2*Math.sin(Math.toRadians(rot))));
        corners[1][1] = (int)(getY()+(width/2*Math.sin(Math.toRadians(rot)))+(-height/2*Math.cos(Math.toRadians(rot))));
        //Corner 3 (bottom left)
        corners[2][0] = (int)(getX()+(-width/2*Math.cos(Math.toRadians(rot)))-(height/2*Math.sin(Math.toRadians(rot))));
        corners[2][1] = (int)(getY()+(-width/2*Math.sin(Math.toRadians(rot)))+(height/2*Math.cos(Math.toRadians(rot))));
        //Corner 4 (bottom left)
        corners[3][0] = (int)(getX()+(width/2*Math.cos(Math.toRadians(rot)))-(height/2*Math.sin(Math.toRadians(rot))));
        corners[3][1] = (int)(getY()+(width/2*Math.sin(Math.toRadians(rot)))+(height/2*Math.cos(Math.toRadians(rot))));
        //Drags test object to specified corner for testing
        if(!tests){
            Stages world = (Stages)getWorld();
            world.addObject(test, corners[0][0], corners[0][1]);
            world.addObject(test1, corners[1][0], corners[1][1]);
            world.addObject(test2, corners[2][0], corners[2][1]);
            world.addObject(test3, corners[3][0], corners[3][1]);
            tests=true;
        }
        test.setLocation(corners[0][0], corners[0][1]);
        test1.setLocation(corners[1][0], corners[1][1]);
        test2.setLocation(corners[2][0], corners[2][1]);
        test3.setLocation(corners[3][0], corners[3][1]);
    }
    public int getHeight(){
        return height;
    }
    public int getWidth(){
        return width;
    }
}
