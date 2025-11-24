import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SelectButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectButton extends Actor
{
    /**
     * Act - do whatever the SelectButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            select();
        }
    }
    public void select(){
        
    }
}
