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
       setRotation(210);
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
       test.setLocation(getX()+(getImage().getWidth()/2),getY());

    }
}
