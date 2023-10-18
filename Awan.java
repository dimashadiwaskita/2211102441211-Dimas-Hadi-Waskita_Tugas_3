import greenfoot.*;

public class Awan extends Actor {
    private int speed = 2;

    public Awan() {
        setImage("awan_kecil.png"); // Gantilah "bee.png" dengan gambar musuh Anda
    }

    public void act() {
        move(-speed); // Musuh bergerak ke kiri

        // Cek apakah musuh telah mencapai batas kiri dunia
        if (getX() <= 0) {
            // Jika iya, respawn musuh ke posisi kanan layar
            setLocation(getWorld().getWidth(), Greenfoot.getRandomNumber(getWorld().getHeight()));
        }
    }
}

