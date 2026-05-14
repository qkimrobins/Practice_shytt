import java.awt.*;

public class BasicUI {

    public static void main(String[] args) {

        Frame f = new Frame("Basic UI");

        Label l = new Label("Enter Name:");

        TextField tf = new TextField();

        Button b = new Button("Submit");

        l.setBounds(50,50,100,30);

        tf.setBounds(150,50,150,30);

        b.setBounds(150,100,80,30);

        f.add(l);
        f.add(tf);
        f.add(b);

        f.setLayout(null);

        f.setSize(400,300);

        f.setVisible(true);
    }
}