import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fire extends Actor
{
    /**
     * Act - do whatever the Fire wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Fire(){
        getImage().scale(getImage().getWidth()/4, getImage().getHeight()/4);
    }
    public void act()
    {
        Stages world = (Stages)getWorld();
      if(Greenfoot.mouseClicked(this) || Greenfoot.isKeyDown("space")){
          world.getCannon().fire();
        }
    }
}
