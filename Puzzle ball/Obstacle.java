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
            //whenHit();
        }
    }
    public void whenHit(){
        //Set as variables for easier reading
        height = getImage().getHeight();
        width = getImage().getWidth();
        //Gets ball
        Ball ball = (Ball)getOneIntersectingObject(Ball.class);
        if(ball != null){
            //Checks if colliding from above/below
            if(ball.getY()<=getY()+height/2+1||ball.getY()>=getY()-height/2-1){
                ball.updatevVel(-bounce*ball.getvVel());
            }
            else{
                ball.updatehVel(-bounce*ball.gethVel());
            }
            //Find angles
            
        }
    }
    public int getHeight(){
        return height;
    }
    public int getWidth(){
        return width;
    }
}
