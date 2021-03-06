import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Crab extends Actor
{
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(4);
        gira();
        come();
    }    
    
    public void gira(){
        
         if(Greenfoot.isKeyDown("left"))
        {
            turn(-3);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            turn(3);
        }
        
    }
    
    public void come(){
        
        if(isTouching(Worm.class)){
            Greenfoot.playSound("eating.wav");
            removeTouching(Worm.class);
            World mundo = getWorld();
            ((CrabWorld)mundo).incrementaGusanos();
            
        }
    }
    
    
}
