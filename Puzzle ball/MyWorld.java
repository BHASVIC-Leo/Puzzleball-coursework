import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    pSlider pSlider = new pSlider();
    pText pText = new pText();
    pHead pHead = new pHead();
    aSlider aSlider = new aSlider();
    aText aText = new aText();
    aHead aHead = new aHead();
    Cannon cannon = new Cannon();
    Ball ball = new Ball(0,0);
    hText hText = new hText();
    vText vText = new vText();
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();

    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        button1 button1 = new button1();
        addObject(button1,166,200);
        button2 button2 = new button2();
        addObject(button2,379,179);
        button2.setLocation(378,207);
        button3 button3 = new button3();
        addObject(button3,514,189);
        button1.setLocation(122,203);
        button2.setLocation(329,209);
        button3.setLocation(462,194);
        button2.setLocation(309,196);
        button3.setLocation(491,209);
        button1.setLocation(132,218);
    }

    public pSlider getpSlider(){
        return pSlider;
    }
    public pHead getpHead(){
        return pHead;
    }
    public pText getpText(){
        return pText;
    }
    public aSlider getaSlider(){
        return aSlider;
    }
    public aHead getaHead(){
        return aHead;
    }
    public aText getaText(){
        return aText;
    }
    public Ball getBall(){
        return ball;
    }
    public Cannon getCannon(){
        return cannon;
    }
    public hText gethText(){
        return hText;
    }
    public vText getvText(){
        return vText;
    }
}
