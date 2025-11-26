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
        double cAngle;
        height = getImage().getHeight();
        width = getImage().getWidth();
        //Checks if colliding from above/below
        if(ball.getY()<=getY()-height/2+1||ball.getY()>=getY()+height/2-1){
                ball.updatevVel(-bounce*ball.getvVel());
        }
        else{
                ball.updatehVel(-bounce*ball.gethVel());
        }
        //Cheks if colliding with left side
        if(ball.getX()<=Math.max(corners[0][0], corners[2][0])+5 && ball.getX()>=Math.min(corners[0][0], corners[2][0])-5 && ball.getY()<=Math.max(corners[0][1], corners[2][1])+5 && ball.getY()>=Math.min(corners[0][1], corners[2][1])-5){
            cAngle=Math.toDegrees((Math.atan(Math.toRadians(corners[0][1]- corners[2][1])/Math.toRadians(corners[0][0]-corners[2][0]))));
            ball.setLocation(10,5);
        }
        
    }
    public void corners(){
        int rot=getRotation();
        int width = getImage().getWidth();
        int height = getImage().getHeight();
        int[][] corners = new int[4][2];
        //Corner 1 (top left)
        corners[0][0] = (int)(getX()+(-width/2*Math.cos(Math.toRadians(rot)))-(-height/2*Math.sin(Math.toRadians(rot))));
        corners[0][1] = (int)(getY()+(-width/2*Math.sin(Math.toRadians(rot)))+(-height/2*Math.cos(Math.toRadians(rot))));
        //Corner 2 (top right)
        corners[1][0] = (int)(getX()+(width/2*Math.cos(Math.toRadians(rot)))-(-height/2*Math.sin(Math.toRadians(rot))));
        corners[1][1] = (int)(getY()+(width/2*Math.sin(Math.toRadians(rot)))+(-height/2*Math.cos(Math.toRadians(rot))));
        //Corner 3 (bottom left)
        corners[2][0] = (int)(getX()+(-width/2*Math.cos(Math.toRadians(rot)))-(height/2*Math.sin(Math.toRadians(rot))));
        corners[2][1] = (int)(getY()+(-width/2*Math.sin(Math.toRadians(rot)))+(height/2*Math.cos(Math.toRadians(rot))));
        //Corner 4 (bottom right)
        corners[3][0] = (int)(getX()+(width/2*Math.cos(Math.toRadians(rot)))-(height/2*Math.sin(Math.toRadians(rot))));
        corners[3][1] = (int)(getY()+(width/2*Math.sin(Math.toRadians(rot)))+(height/2*Math.cos(Math.toRadians(rot))));
    }
    public int getHeight(){
        return height;
    }
    public int getWidth(){
        return width;
    }
}
