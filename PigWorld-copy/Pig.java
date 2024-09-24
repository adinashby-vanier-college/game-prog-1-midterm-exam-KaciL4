// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Pig extends Actor
{

    /**
     * Act - do whatever the Pig wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAndTurn();
        eat();
        
        if (isGameWon()) {
            transitionToGameWonWorld();
        }
    }

    /**
     * make Pig move around with the arrow left and right
     */
    public void moveAndTurn()
    {
        move(4);
        if (Greenfoot.isKeyDown("left")) {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(3);
        }
    }

    /**
     * Make the Pig eat the Burger
     */
    public void eat()
    {
        Actor Burger = getOneIntersectingObject(Burger.class);
        if (Burger != null) {
            World world = getWorld();
            world.removeObject(Burger);
            Greenfoot.playSound("eating.wav");
        }
    }

    /**
     * Make the user win the game when the pig eat all the burgers
     */
    public boolean isGameWon()
    {
        World world = getWorld();
        if (world.getObjects(Burger.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Make a transition to the GameWonWorld when the user win
     */
    public void transitionToGameWonWorld()
    {
        World gameWonWorld =  new  GameWonWorld();
        Greenfoot.setWorld(gameWonWorld);
        Greenfoot.playSound("win.wav");
    }
}
