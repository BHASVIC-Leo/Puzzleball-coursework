import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Honey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Honey extends Obstacle
{
    /**
     * Act - do whatever the Honey wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public Honey(int xOscillate, int yOscillate, int baseRotation){
       xOsc=xOscillate;
       yOsc=yOscillate;
       startRot= baseRotation;
       getImage().scale(getImage().getWidth()/2, getImage().getHeight()/2);//Sets image to a suitable scale
       bounce = 0.4;
    }
}
