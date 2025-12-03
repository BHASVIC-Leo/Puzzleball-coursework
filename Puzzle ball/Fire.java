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
    int buffer=0;
    public Fire(){
        getImage().scale(getImage().getWidth()/4, getImage().getHeight()/4);//Sets image to a suitable scale
    }
    public void act()
    {
        buffer--;
        Stages world = (Stages)getWorld();
        if(buffer<0){
           if(Greenfoot.mouseClicked(this) || Greenfoot.isKeyDown("space")){//Shoots when clicked or space is pressed
               buffer=5;
               world.getCannon().fire();
          } 
        }
    }
}
