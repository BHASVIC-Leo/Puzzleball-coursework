import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class num1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class num1 extends Stagenumbers
{
    /**
     * Act - do whatever the num1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public num1(){
    }
    public void act()
    {
        GreenfootImage text = new GreenfootImage(65,30);
        setImage(text);
        MyWorld world = (MyWorld)getWorld();
        //If corresponding world has been won change colour to green to signify completion
        if(world.getwin1()){
            text.setColor(Color.GREEN);
        }
        else{
           text.setColor(Color.BLACK); 
        }
        text.drawString("1", 30,30);
    }
}
