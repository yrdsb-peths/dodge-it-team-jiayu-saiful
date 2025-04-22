import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Penguin hero = new Penguin();
        addObject(hero, 100, 100);
    }
}
