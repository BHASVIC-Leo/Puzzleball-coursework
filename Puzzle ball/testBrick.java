import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class testBrick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class testBrick extends Brick
{
    /**
     * Act - do whatever the testBrick wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public testBrick(){
       getImage().scale(getImage().getWidth(), getImage().getHeight()/2);
       setRotation(30);
       bounce = 0.7;
   }
   public void act(){
       if(Greenfoot.isKeyDown("e")){
          setRotation(getRotation()+1); 
        }
       if(Greenfoot.isKeyDown("q")){
          setRotation(getRotation()-1); 
       }
       //find corners
       Stages world = (Stages)getWorld();
       Test test = world.getTest();
       corners();
       
       int c1X=getX()-(getImage().getWidth()/2);
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
        //Corner 4 (bottom left)
        corners[3][0] = (int)(getX()+(width/2*Math.cos(Math.toRadians(rot)))-(height/2*Math.sin(Math.toRadians(rot))));
        corners[3][1] = (int)(getY()+(width/2*Math.sin(Math.toRadians(rot)))+(height/2*Math.cos(Math.toRadians(rot))));
        //Drags test object to specified corner for testing
        Stages world = (Stages)getWorld();
        Test test = world.getTest();
        test.setLocation( corners[3][0], corners[3][1]);
    }
}
