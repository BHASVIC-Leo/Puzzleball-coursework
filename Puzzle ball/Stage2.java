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
        addObject(blue,840,300);
        addObject(darkGray,36,536);
        addObject(cannon,74,428);
        addObject(wheel,44,452);
        addObject(fire,840,549);
        addObject(pSlider,838,475);
        addObject(pHead,672,468);
        addObject(pText,843,419);
        addObject(pSlider,838,440);
        addObject(pHead,672,468);
        addObject(pText,843,419);
        addObject(aSlider,838,400);
        addObject(aHead,820,572);
        addObject(aText,799,628);
        addObject(hText,838,220);
        addObject(vText,838, 180);
        addObject(angleT, 838, 150);
        addObject(flag, 700, 520);
        addObject(home,865,38);
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

