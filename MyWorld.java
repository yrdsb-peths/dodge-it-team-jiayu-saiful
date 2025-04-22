import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Penguin hero = new Penguin();
        addObject(hero, 100, 100);
        
        Bomb bomb = new Bomb();
        addObject(bomb, 500, 100);
    }
}
