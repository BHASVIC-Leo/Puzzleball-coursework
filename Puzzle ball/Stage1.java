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
    public Stage1(boolean stage1, boolean stage2, boolean stage3)
    {
        stage=1;
        win1 = stage1;
        win2 = stage2;
        win3 = stage3;
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
        Slime slime = new Slime(0, 0, 0);
        addObject(slime,290,511);
        slime.setLocation(251,521);
        Honey honey = new Honey(0, 0, 0);
        addObject(honey,598,495);
        honey.setLocation(578,521);
        Flag flag = new Flag();
        addObject(flag,702,335);
        Brick brick = new Brick(0, 100, 0);
        addObject(brick,420,313);
        Brick brick2 = new Brick(0, 0, 90);
        addObject(brick2,665,254);
        brick2.setLocation(703,257);
    }
}
