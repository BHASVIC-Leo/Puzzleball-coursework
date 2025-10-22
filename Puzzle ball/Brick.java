import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Brick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Brick extends Obstacle
{
   public Brick(){
       getImage().scale(getImage().getWidth()*4, getImage().getHeight());
       bounce = 0.5;
   }
}
