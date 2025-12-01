import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Win here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Win extends SelectButton
{
    /**
     * Act - do whatever the Win wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Win(){
        getImage().scale(getImage().getWidth()/2, getImage().getHeight()/2);
    }
    public void select(){
        Stages world = (Stages)getWorld();
           MyWorld home = new MyWorld(world.getwin1(), world.getwin2(), world.getwin3());
           if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(home);
        }
    }
}
