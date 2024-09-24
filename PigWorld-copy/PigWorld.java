// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class PigWorld extends World
{

    /**
     * Constructor for objects of class PigWorld.
     */
    public PigWorld()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Burger burger =  new  Burger();
        addObject(burger, 504, 67);
        burger.setLocation(513, 75);
        burger.setLocation(491, 77);
        burger.setLocation(456, 74);
        Burger burger2 =  new  Burger();
        addObject(burger2, 408, 126);
        burger.setLocation(462, 48);
        burger2.setLocation(392, 102);
        Burger burger3 =  new  Burger();
        addObject(burger3, 520, 249);
        burger3.setLocation(507, 255);
        Burger burger4 =  new  Burger();
        addObject(burger4, 373, 300);
        Burger burger5 =  new  Burger();
        addObject(burger5, 111, 56);
        Burger burger6 =  new  Burger();
        addObject(burger6, 206, 61);
        Burger burger7 =  new  Burger();
        addObject(burger7, 150, 127);
        Pig pig =  new  Pig();
        addObject(pig, 195, 196);
        Snake snake =  new  Snake();
        addObject(snake, 537, 348);
        Burger burger8 =  new  Burger();
        addObject(burger8, 69, 300);
        Burger burger9 =  new  Burger();
        addObject(burger9, 166, 354);
    }
}
