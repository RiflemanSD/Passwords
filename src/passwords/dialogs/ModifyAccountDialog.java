package passwords.dialogs;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * ImageViewer is the main class of the image viewer application. It builds and
 * displays the application GUI and initialises all other components.
 *
 * To start the application, create an object of this class.
 *
 * @author Michael Kolling and David J Barnes
 * @version 0.1
 */
public class ModifyAccountDialog extends JFrame {
    
    private int numberOfLabels;
    private JLabel[] labels;
    private JTextField[] fields;
    private JButton[] buttons;
    private JButton okButton;
    private JButton cancelButton;
    /**
     * Create an ImageViewer show it on screen.
     */
    public ModifyAccountDialog(ActionListener okButton, ActionListener cancelButton) {
        makeFrame(3, okButton, cancelButton);
    }

    // ---- swing stuff to build the frame and all its components ----
    /**
     * Create the Swing frame and its content.
     */
    private void makeFrame(int n, ActionListener okButton, ActionListener cancelButton) {
        setTitle("ImageViewer");               
        //setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.labels = new JLabel[n];
        this.fields = new JTextField[n];
        this.okButton = new JButton("OK");
        this.cancelButton = new JButton("Cancel");
        
        this.okButton.addActionListener(okButton);
        this.cancelButton.addActionListener(cancelButton);
        
        this.labels[0] = new JLabel("Username:");
        this.labels[1] = new JLabel("Password:");
        this.labels[2] = new JLabel("E-mail:");
        
        this.fields[0] = new JTextField("name");
        this.fields[1] = new JTextField("pass");
        this.fields[2] = new JTextField("periodikikinisi@hotmail.gr");
        
        //Container contentPane = this.getContentPane();
        this.rootPane.setLayout(new BorderLayout());
        //this.rootPane.setLayout(new BoxLayout(this.rootPane, BoxLayout.X_AXIS));
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        
        p1.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 5));
        p2.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 3));
        p3.setLayout(new GridLayout(this.numberOfLabels,1));
        p4.setLayout(new GridLayout(this.numberOfLabels,1));
        
        p3.add(this.labels[0]);
        p4.add(this.fields[0]);
        p3.add(this.labels[1]);
        p4.add(this.fields[1]);
        p3.add(this.labels[2]);
        p4.add(this.fields[2]);
        
        p2.add(this.okButton);
        p2.add(this.cancelButton);
        p1.add(p3);
        p1.add(p4);
        
        //this.rootPane.add(p1, BorderLayout.NORTH);
        this.rootPane.add(p1, BorderLayout.CENTER);
        this.rootPane.add(p2, BorderLayout.PAGE_END);
        
        
        this.pack();
        //setResizable(false);
        setVisible(true);
    }
    
    public String[] getTexts() {
        String[] s = new String[3];
        s[0] = this.fields[0].getText();
        s[1] = this.fields[1].getText();
        s[2] = this.fields[2].getText();
        
        return s;
    }
    
    public void setTexts(String[] s) {
        this.fields[0].setText(s[0]);
        this.fields[1].setText(s[1]);
        this.fields[2].setText(s[2]);
    }
    
    public void close() {
        this.dispose();
    }
}
