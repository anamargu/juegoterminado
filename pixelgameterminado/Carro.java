import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class obstaculo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carro extends Actor
{
    private int speed;
    public Carro (int velocidad){
        speed = velocidad;

    }
   
    public void act()
    {
        if(Greenfoot.isKeyDown("right")){
            if ( getX() < 360)
            setLocation (getX () + speed, getY());
        }
        if(Greenfoot.isKeyDown("left")){
             if ( getX() > 55)
            setLocation (getX () - speed, getY());
            
            
        }
        if(Greenfoot.isKeyDown("up")){
             if ( getY() > 100)
            setLocation (getX () , getY() - speed );
            
        }
        if(Greenfoot.isKeyDown("down")){
             if ( getY() < 540)
            setLocation (getX () , getY() + speed );
            
        }
        
        checkCollision();
    }
    public void checkCollision(){
        Actor obstaculo = getOneIntersectingObject (obstaculo.class);
        if (obstaculo  != null )
        {
            Greenfoot.setWorld(new Fin());
            
 
        }
}
    public void aumenta_velocidad(){
        speed++;
        
    }
}
