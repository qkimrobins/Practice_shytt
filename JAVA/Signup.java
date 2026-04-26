import java.awt.*;
import java.awt.event.*;
public class Signup extends Frame {
    public Signup() {
        setLayout(new FlowLayout());       
        TextField nameinp = new TextField("UserName", 20);
        TextField rollinp = new TextField("password", 20);
        Button btn = new Button("Submit");
        Label output = new Label("Results will show here...         ");
        btn.addActionListener(e -> {
            String name = nameinp.getText();
            String roll = rollinp.getText();
            output.setText("Username: " + name + ", password: " + roll );
        });
        add(nameinp);
        add(rollinp);
        add(btn);      
        add(output);
        setTitle("Signup Form");
        setSize(300, 200);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { dispose(); }
        });
    }
    public static void main(String[] args) {
        new Signup();
    }
}