import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class pHead here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pHead extends Actor
{
    /**
     * Act - do whatever the pHead wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int width = 20;
    int height = 20;
    boolean mouseDown = false; 
    boolean isStartPos = false;
    public pHead(){
        //Creates head
        GreenfootImage rect = new GreenfootImage(width,height);
        setImage(rect);
        rect.setColor(Color.BLACK);
        rect.drawRect(0,0,width,height);
        rect.setColor(Color.RED);
        rect.fillRect(1,1, width, height-1);
    }
    public void act()
    {
        //Gets all the needed actors
        MyWorld world = (MyWorld)getWorld();
        MouseInfo mouse = Greenfoot.getMouseInfo(); 
        pSlider slider = world.getpSlider();
        //Sends head to slider but doesnt repeat to allow movement
        if(!isStartPos){
            setLocation(slider.getX(),slider.getY());
            isStartPos=true;
        }
        //Code for following the mouse
        if(Greenfoot.mousePressed(this)==true){
            mouseDown=true;
        }
        else if(Greenfoot.mouseClicked(this)){
            mouseDown=false;
        }
        if(mouse!=null){
            //Check within Y bounds
            if(this.getY()>mouse.getY()+10 || this.getY()<mouse.getY()-10){
                mouseDown=false;
            }
            //Check within X bounds
            if(mouse.getX()>slider.getX()+50 || mouse.getX()<slider.getX()-50){
                mouseDown=false;
            }
        }
        if(mouseDown){
            setLocation(mouse.getX(),this.getY());
        }
    }
}
