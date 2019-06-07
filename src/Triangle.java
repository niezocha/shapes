import java.awt.*;
import java.awt.geom.GeneralPath;
import java.util.Random;

public class Triangle {

    int x, y, m, n;

    public Triangle(int x, int y, int m, int n){
        this.x = x;
        this.y = y;
        this.m = m;
        this.n = n;
    }

    public Random random = new Random();
    int q = random.nextInt(256);
    int w = random.nextInt(256);
    int e = random.nextInt(256);



    public void draw(Graphics g){
        g.setColor(new Color(q, w, e));
        int [] xPoints = {m/2,n, 0 };
        int [] yPoints = {0, n, n};

        Graphics2D g2d = (Graphics2D)g;
        GeneralPath triangle = new GeneralPath();




        triangle.moveTo(xPoints[0] + x, yPoints[0] + y);
        for(int i = 1; i < xPoints.length; i++){
            triangle.lineTo(xPoints[i]+x, yPoints[i]+y);
        }
        triangle.closePath();
        g2d.draw(triangle);


    }


}
