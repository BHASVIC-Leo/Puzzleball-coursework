import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Brick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Brick extends Obstacle
{
   public Brick(int xOscillate, int yOscillate, int baseRotation){
       xOsc=xOscillate;
       yOsc=yOscillate;
       startRot= baseRotation;
       getImage().scale(getImage().getWidth(), getImage().getHeight()/2);//Sets image to a suitable scale
       bounce = 0.7;
   }
}
