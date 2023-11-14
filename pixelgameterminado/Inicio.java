import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Inicio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inicio extends World
{
    public Inicio()
    {    
        super(500, 400, 1); 
        
         prepare();
        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */

    private void prepare()
    {
        Jugar jugar = new Jugar();
        addObject(jugar, 406, 404);
        Salir salir = new Salir();
        addObject(salir, 417, 470);
              


        jugar.setLocation(348,297);
        salir.setLocation(388,314);
        salir.setLocation(326,271);
        jugar.setLocation(98,264);
        salir.setLocation(322,261);
        jugar.setLocation(138,290);
        salir.setLocation(327,267);
        removeObject(salir);
        Salir salir2 = new Salir();
        addObject(salir2,356,290);
    }
}


