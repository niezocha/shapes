import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import java.util.List;

    public class AFrame   extends JPanel {
        public List<Object> shapes = new ArrayList<>();
        public Random random = new Random();
        public List<Object> list = new ArrayList<>();

        Timer timer;
        int count = 0;

        public AFrame() {
            setBackground(Color.gray);
            setPreferredSize(new Dimension(getWidth(), getHeight()));

            ActionListener t = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int d = random.nextInt(5);

                    if (d < 1) {
                        addCircle(getWidth() / 2, getHeight() / 2, getWidth() / 2);
                        try {
                            save("C:\\DZO\\STUDIA\\SEMESTR 2\\try.txt");
                        }catch (IOException ex){
                            System.out.println("ex caught");
                        }
                    } else if (d < 2) {
                        addRect(getWidth() / 2, getHeight() / 2, getWidth() / 2, getHeight() / 2);
                        try {
                            save("C:\\DZO\\STUDIA\\SEMESTR 2\\try.txt");
                        }catch (IOException ex){
                            System.out.println("ex caught");
                        }
                    } else if (d < 3) {
                        addElipse(getWidth() / 2, getHeight() / 2, getWidth() / 2, getHeight() / 2);
                        try {
                            save("C:\\DZO\\STUDIA\\SEMESTR 2\\try.txt");
                        }catch (IOException ex){
                            System.out.println("ex caught");
                        }
                    } else if (d < 4) {
                        addSquare(getWidth() / 2, getHeight() / 2, getWidth() / 2);
                        try {
                            save("C:\\DZO\\STUDIA\\SEMESTR 2\\try.txt");
                        }catch (IOException ex){
                            System.out.println("ex caught");
                        }
                    } else {
                        addTriangle(getWidth() / 2, getHeight() / 2, getWidth() / 2, getHeight() / 2);
                        try {
                            save("C:\\DZO\\STUDIA\\SEMESTR 2\\try.txt");
                        }catch (IOException ex){
                            System.out.println("ex caught");
                        }
                    }

                    if (++count == 25) {
                        timer.stop();
                    }
                }
            };
            timer = new Timer(500, t);
            timer.start();

            try {
                read();
            } catch (IOException exe) {
                System.out.println("Ex ca");
            }
        }

        public void save(String fileName) throws FileNotFoundException {
            PrintWriter pw = new PrintWriter(new FileOutputStream(fileName));
            for (Object sh : shapes) {
                if (sh instanceof Circle) {
                    pw.println(sh);
                    ((Circle) sh).;
            } else if (sh instanceof Square) {
                    pw.println(sh);
                    ((Square) sh).;
            } else if (sh instanceof Rect) {
                    pw.println(sh);
                    ((Rect) sh)
            } else if (sh instanceof Triangle) {
                    pw.println(sh);
                    ((Triangle) sh).draw(g);
            } else if (sh instanceof Elipse) {
                ((Elipse) s).draw(g);
            }
            }
              ;
            pw.close();
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            for (Object s : shapes) {
                if (s instanceof Circle) {
                    ((Circle) s).draw(g);
                } else if (s instanceof Square) {
                    ((Square) s).draw(g);
                } else if (s instanceof Rect) {
                    ((Rect) s).draw(g);
                } else if (s instanceof Triangle) {
                    ((Triangle) s).draw(g);
                } else if (s instanceof Elipse) {
                    ((Elipse) s).draw(g);
                }

            }
        }

        public void addCircle(int maxX, int maxY, int maxR) {
            shapes.add(new Circle(random.nextInt(maxX), random.nextInt(maxY), random.nextInt(maxR)));
            repaint();
        }

        public void addTriangle(int maxTX, int maxTY, int maxM, int maxN) {
            shapes.add(new Triangle(random.nextInt(maxTX), random.nextInt(maxTY), random.nextInt(maxM), random.nextInt(maxN)));
            repaint();
        }

        public void addRect(int maxRX, int maxRY, int maxA, int maxB) {
            shapes.add(new Rect(random.nextInt(maxRX), random.nextInt(maxRY), random.nextInt(maxA), random.nextInt(maxB)));
            repaint();
        }

        public void addSquare(int maxSX, int maxSY, int S) {
            shapes.add(new Square(random.nextInt(maxSX), random.nextInt(maxSY), random.nextInt(S)));
            repaint();
        }

        public void addElipse(int maxEX, int maxEY, int maxR1, int maxR2) {
            shapes.add(new Elipse(random.nextInt(maxEX) * getWidth(), random.nextInt(maxEY) * getHeight(), random.nextInt(maxR1) * getWidth(), random.nextInt(maxR2) * getHeight()));
            repaint();
        }



        public void read() throws IOException {
            Scanner s = new Scanner(new File("C:\\DZO\\STUDIA\\SEMESTR 2\\try.txt" ));
            while (s.hasNext()) {
                list.add(s.next());
            }
            s.close();



        }

    }

