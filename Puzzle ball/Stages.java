import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stages here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stages extends World
{

    /**
     * Constructor for objects of class Stages.
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
    public Stages()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    private void prepare(){
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
        addObject(hText,538,120);
        addObject(vText,538, 80);
        Brick brick = new Brick();
        addObject(brick,251,348);
        brick.setLocation(338,251);
        brick.setLocation(284,19);
        Brick brick2 = new Brick();
        addObject(brick2,296,385);
        brick2.setLocation(301,345);
        brick.setLocation(308,103);
        brick.setLocation(304,97);
        brick.setLocation(301,58);
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
