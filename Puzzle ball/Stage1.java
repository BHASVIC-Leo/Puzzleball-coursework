import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stage1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stage1 extends Stages
{

    /**
     * Constructor for objects of class Stage1.
     * 
     */
    public Stage1()
    {
        prepare();
    }
    public void prepare(){
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
        addObject(home,865,38);
        testBrick brick = new testBrick();
        addObject (brick, 300, 200);
    }
}
