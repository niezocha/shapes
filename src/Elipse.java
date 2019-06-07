import java.awt.*;
import java.util.Random;

public class Elipse {

    int x, y, rad1, rad2;

    public Elipse(int x, int y, int rad1, int rad2){
        this.x = x;
        this.y = y;
        this.rad1 = rad1;
        this.rad2 = rad2;
    }
    public Random random = new Random();
    int q = random.nextInt(256);
    int w = random.nextInt(256);
    int e = random.nextInt(256);



    public void draw(Graphics g){
        g.setColor(new Color(q, w, e));
        g.drawOval(x, y, rad1, rad2);
    }
}
