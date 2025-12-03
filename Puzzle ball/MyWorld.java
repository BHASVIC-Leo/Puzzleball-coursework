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
    boolean win1=false;
    boolean win2=false;
    boolean win3=false;
    public MyWorld(boolean stage1, boolean stage2, boolean stage3)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        win1 = stage1;
        win2 = stage2;
        win3 = stage3;
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
        button3.setLocation(517,174);
        button2.setLocation(299,259);
        button3.setLocation(493,163);
        button1.setLocation(156,167);
        fCannon cannon = new fCannon();
        addObject(cannon,144,212);
        cannon.setLocation(70,266);
        darkGray darkGray = new darkGray();
        addObject(darkGray,79,387);
        darkGray.setLocation(35,351);
        cannon.setLocation(62,231);
        cannon.setLocation(57,214);
        Wheel wheel = new Wheel();
        addObject(wheel,29,268);
        wheel.setLocation(29,267);
        cannon.setLocation(49,238);
        button1.setLocation(145,161);
        num1 num1 = new num1();
        addObject(num1,145,161);
        num2 num2 = new num2();
        addObject(num2,299,249);
        num3 num3 = new num3();
        addObject(num3,493,163);
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
    public boolean getwin1(){
        return win1;
    }
    public boolean getwin2(){
        return win2;
    }
    public boolean getwin3(){
        return win3;
    }
}
