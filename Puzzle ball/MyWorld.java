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
    Ball ball = new Ball();
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

        Blue blue = new Blue();
        addObject(blue,540,200);
        darkGray darkGray = new darkGray();
        addObject(darkGray,36,336);
        addObject(cannon,74,228);
        Wheel wheel = new Wheel();
        addObject(wheel,44,252);
        Fire fire = new Fire();
        addObject(fire,540,349);
        addObject(pSlider,538,275);
        addObject(pHead,372,268);
        addObject(pText,543,219);
        addObject(pSlider,538,240);
        addObject(pHead,372,268);
        addObject(pText,543,219);
        addObject(aSlider,538,200);
        addObject(aHead,520,172);
        addObject(aText,499,128);
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
}
