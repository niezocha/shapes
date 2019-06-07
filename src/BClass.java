import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BClass extends JPanel {
    ArrayList<Object> list = new ArrayList<>();


    public BClass() {
        setBackground(Color.gray);
        setPreferredSize(new Dimension(getWidth(), getHeight()));
        try {
            read();
        } catch (IOException exe) {
            System.out.println("Ex ca");
        }


    }


    public void read() throws IOException {
        Scanner s = new Scanner(new File("C:\\DZO\\STUDIA\\SEMESTR 2\\try.txt"));
        while (s.hasNext()) {
            list.add(s.next());
        }
        s.close();

        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Circle myC = new Circle(100, 100, 100);
            myC.draw(g);
        }}







