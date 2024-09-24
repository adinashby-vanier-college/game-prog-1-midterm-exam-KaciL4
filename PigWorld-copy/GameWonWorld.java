// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameWonWorld extends World
{

    /**
     * Constructor for objects of class GameWonWorld.
     */
    public GameWonWorld()
    {
        super(600, 400, 1);
        showTextInColor("You win!", 140, 200);
    }

    /**
     * write the message
     */
    public void showTextInColor(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(90);
        bg.setFont(font);
        bg.setColor(Color.YELLOW);
        bg.drawString(message, x, y);
    }
}
