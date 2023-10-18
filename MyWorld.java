import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {    
        super(600, 400, 1); 
        addObject(new Flappybird(), 100, 300);
        addObject(new Pipe(), 300, 150);
        addObject(new Pipe(), 600, 150);
        addObject(new Score(), 300, 100);
        addObject(new Awan(), 500, 250); // Tambahkan musuh ke dunia permainan
    }
}
