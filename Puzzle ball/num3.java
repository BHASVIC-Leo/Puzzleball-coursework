import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class num3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class num3 extends Stagenumbers
{
    /**
     * Act - do whatever the num3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage text = new GreenfootImage(65,30);
        setImage(text);
        MyWorld world = (MyWorld)getWorld();
        if(world.getwin3()){
            text.setColor(Color.GREEN);//If corresponding world has been won change colour to green to signify completion
        }
        else{
           text.setColor(Color.BLACK); 
        }
        text.drawString("3", 30,30);
    }
}
