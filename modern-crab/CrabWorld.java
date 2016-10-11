import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrabWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{
    private Counter contGusanos; 
    private Counter contVidas;
    private Crab cangrejo;
    private Lobster langosta;
    /**
     * Constructor for objects of class CrabWorld.
     * 
     */
    public CrabWorld()
    {    
        super(560, 560, 1); 
        contGusanos= new Counter("Gusanos: ");
        addObject(contGusanos, 64,20);
        contVidas= new Counter("Vidas: ");
        contVidas.setValue(3);
        addObject(contVidas, 500,20);
        prepare();
    }

    public void act()
    {
        contGusanos.act();
    }

    public void incrementaGusanos()
    {
        contGusanos.add(1);
    }
    
    
    public void decrementaVidas()
    {
        contVidas.add(-1);
    }
    
    public void reiniciaPosCan()
    {
        cangrejo.setLocation(60,80);
    }
    
    public void cangrejoAtrapado()
    {
        decrementaVidas();
        langosta.setLocation(20,30);
        cangrejo.setLocation(214,211);
        if(contVidas.getValue() == 0){
             Label etiqueta = new Label("Game Over",25);
             addObject(etiqueta,250,250);
             Greenfoot.stop();
            }
            if(contGusanos.getValue() == 5){
                Label etiquetaw = new Label("Winner",25);
                addObject(etiquetaw,250,250);
            }
     }
            


    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        cangrejo = new Crab();
        addObject(cangrejo,249,229);
        Worm worm = new Worm();
        addObject(worm,336,111);
        Worm worm2 = new Worm();
        addObject(worm2,452,106);
        Worm worm3 = new Worm();
        addObject(worm3,452,106);
        Worm worm4 = new Worm();
        addObject(worm4,380,120);
        Worm worm5 = new Worm();
        addObject(worm5,423,117);
        Worm worm6 = new Worm();
        addObject(worm6,457,172);
        Worm worm7 = new Worm();
        addObject(worm7,430,202);
        Worm worm8 = new Worm();
        addObject(worm8,389,254);
        Worm worm9 = new Worm();
        addObject(worm9,364,293);
        Worm worm10 = new Worm();
        addObject(worm10,413,228);
        langosta = new Lobster();
        addObject(langosta,300,176);
    }
}

  
    
