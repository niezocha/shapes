import javax.swing.*;


public class Main {

    public static void main(String[] args) {




        JFrame frame = new JFrame();
        frame.add(new AFrame());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Project");
        frame.setVisible(true);
        frame.setSize(800, 800);


        JFrame bframe = new JFrame();
       bframe.add(new BClass());
        bframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bframe.setTitle("ProjectB");
        bframe.setVisible(true);
        bframe.setSize(800, 800);


    }
}

