import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stage3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stage3 extends Stages
{

    /**
     * Constructor for objects of class Stage3.
     * 
     */
    public Stage3()
    {
        prepare();
    }
    public void prepare(){
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
        addObject(home,565,38);
    }
}
