import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stage2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stage2 extends Stages
{

    /**
     * Constructor for objects of class Stage1.
     * 
     */
    
    public Stage2()
    {    
        prepare();
    }
    private void prepare(){
        addObject(blue,540,200);
        addObject(darkGray,36,336);
        addObject(cannon,74,228);
        addObject(wheel,44,252);
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
        addObject(brick,251,348);
        brick.setLocation(338,251);
        brick.setLocation(284,19);
        Brick brick2 = new Brick();
        addObject(brick2,296,385);
        brick2.setLocation(301,345);
        brick.setLocation(308,103);
        brick.setLocation(304,97);
        brick.setLocation(301,58);
        addObject(home,565,38);
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

