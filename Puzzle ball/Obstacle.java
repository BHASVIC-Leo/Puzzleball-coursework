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
    public void act()
    {
        //Checks if hit
        if(getOneIntersectingObject(Ball.class)!=null){
            whenHit();
        }
    }
    public void whenHit(){
        //Gets ball
        Ball ball = (Ball)getOneIntersectingObject(Ball.class);
        if(ball != null){
            if(ball.getY()<=getY()){
                ball.updatevVel(-bounce*ball.getvVel());
            }
            else{
                ball.updatehVel(-bounce*ball.gethVel());
            }
        }
    }
    public int getHeight(){
        return height;
    }
    public int getWidth(){
        return width;
    }
}
