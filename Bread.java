import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Bread extends Actor
{
    public void act()
    {
        move(-10);
        
        if (getX() <=0) {
            resetBread();
        }
    }
    
    public void resetBread() {
        int num = Greenfoot.getRandomNumber(2);
        if (num ==0) {
            setLocation (600,100);
        }
        else {
        setLocation (600,300);
    }
    }
}
