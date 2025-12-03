import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class testBrick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class testBrick extends Obstacle
{
    /**
     * Act - do whatever the testBrick wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //Moveable brick used for testing
    boolean tests=false;
    Test test = new Test();
            Test test1 = new Test();
            Test test2 = new Test();
            Test test3 = new Test();
     public testBrick(int xOscillate, int yOscillate, int baseRotation){
       getImage().scale(getImage().getWidth(), getImage().getHeight()/2);//Sets image to a suitable scale
       setRotation(30);
       bounce = 0.7;
       xOsc=xOscillate;
       yOsc=yOscillate;
   }
   public void act(){
       //Movement keys for testing
       if(Greenfoot.isKeyDown("e")){
          setRotation(getRotation()+1); 
        }
       if(Greenfoot.isKeyDown("q")){
          setRotation(getRotation()-1); 
       }
       if(Greenfoot.isKeyDown("w")){
          setLocation(getX(),getY()+1); 
       }
       if(Greenfoot.isKeyDown("s")){
          setLocation(getX(),getY()-1); 
       }
       if(Greenfoot.isKeyDown("a")){
          setLocation(getX()-1,getY()); 
       }
       if(Greenfoot.isKeyDown("d")){
          setLocation(getX()+1,getY()); 
       }
       //find corners
       corners();
    }
    
}
