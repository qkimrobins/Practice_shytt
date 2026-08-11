import java.awt.*;
import java.awt.event.*;

public class ActionEventDemo {

    public static void main(String[] args) {

        Frame f = new Frame();

        Button b = new Button("Click");

        b.addActionListener(
            new ActionListener() {

            public void actionPerformed(
                ActionEvent e) {

                System.out.println(
                    "Button Clicked");
            }
        });

        f.add(b);

        f.setSize(300,200);

        f.setVisible(true);
    }
}