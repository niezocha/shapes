import java.awt.*;
import java.util.*;

public class Rect {

    int x, y, a, b;

    public Rect(int x, int y, int a, int b){
        this.x = x;
        this.y = y;
        this.a = a;
        this.b = b;
    }

    public Random random = new Random();
    int q = random.nextInt(256);
    int w = random.nextInt(256);
    int e = random.nextInt(256);

    public void draw(Graphics g){

        g.setColor(new Color(q, w, e));
        g.drawRect(x, y, a, b);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
