import java.awt.*;
import java.util.Random;

public class Square {
    int x, y, s;

    public Square(int x, int y, int s){
        this.x = x;
        this.y = y;
        this.s = s;
    }


    public Random random = new Random();
    int q = random.nextInt(256);
    int w = random.nextInt(256);
    int e = random.nextInt(256);



    public void draw(Graphics g){
        g.setColor(new Color(q, w, e));
        g.drawRect(x, y, s, s);
    }

}
