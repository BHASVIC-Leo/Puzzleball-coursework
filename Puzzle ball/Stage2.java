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
    
    public Stage2(boolean stage1, boolean stage2, boolean stage3)
    {
        stage=2;
        win1 = stage1;
        win2 = stage2;
        win3 = stage3;
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
        addObject(home,565,38);
        Brick brick = new Brick(0, 90, 0);
        addObject(brick,215,302);
        brick.setLocation(199,290);
        Honey honey = new Honey(0, 0, 20);
        addObject(honey,390,373);
        testBrick testBrick = new testBrick(50, 0, 90);
        addObject(testBrick,674,332);
        removeObject(testBrick);
        Brick brick2 = new Brick(50, 0, 90);
        addObject(brick2,691,362);
        brick2.setLocation(693,357);
        honey.setLocation(423,443);
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

