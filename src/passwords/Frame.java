/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package passwords;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

/**
 *
 * @author user01
 */
public class Frame extends JFrame {
    //public JMenuBar menuBar;
    
    public Frame() throws HeadlessException {
        super("KeepMyPass");
        //this.menuBar = new JMenuBar();
        init2();
    }
    
    public void init() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar bar = new JMenuBar();
        JMenu menu = new JMenu("File");
        bar.add(menu);

        menu.add(new JMenuItem("Close"));
        menu.add(new JSeparator()); // SEPARATOR
        menu.add(new JMenuItem("Exit"));

        setJMenuBar(bar);
        getContentPane().add(new JLabel("A placeholder"));

        pack();
        setSize(300, 300);
        setVisible(true);
    }
    
    public void init2() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //setJMenuBar(menuBar);
        setSize(350, 250);
        //setVisible(true);
    }
}
