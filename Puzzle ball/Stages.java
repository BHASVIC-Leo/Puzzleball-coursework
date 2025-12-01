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
    angleText angleT = new angleText();
    Flag flag = new Flag();
    Brick brick = new Brick();
    Brick brick2 = new Brick();
    Blue blue = new Blue();
    darkGray darkGray = new darkGray();
    Wheel wheel = new Wheel();
    Fire fire = new Fire();
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
    Home home = new Home();
    Test test = new Test();
    boolean win1;
    boolean win2;
    boolean win3;
    int stage;
    public Stages()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        prepare();
    }
    private void prepare(){
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
    public Test getTest(){
        return test;
    }
    public angleText getangleT(){
        return angleT;
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
    public int getstage(){
        return stage;
    }
    public void updateWin(int stageNum){
        if(stageNum==1){
            win1=true;
        }
        if(stageNum==2){
            win2=true;
        }
        if(stageNum==3){
            win3=true;
        }
    }
}
