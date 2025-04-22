import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Penguin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Penguin extends Actor
{
    /**
     * Act - do whatever the Penguin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    boolean atTop = true;
    
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(null)) {
            atTop = !atTop;
        }
        
        if (atTop) {
            setLocation(100, 100);
        } else {
            setLocation(100, 300);
        }
    }
}
