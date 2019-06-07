import java.awt.*;
import java.util.Random;

public class Circle {
    int x, y, rad;

    public Circle(int x, int y, int rad){
        this.x = x;
        this.y = y;
        this.rad = rad;
    }
    public Random random = new Random();
    int q = random.nextInt(256);
    int w = random.nextInt(256);
    int e = random.nextInt(256);



    public void draw(Graphics g){
        g.setColor(new Color(q, w, e));
        g.drawOval(x, y, rad, rad);
    }


    public int getX() {
        return x;
    }


    public int getY(){
        return y;
    }


}
