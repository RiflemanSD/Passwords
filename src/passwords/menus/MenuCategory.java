/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwords.menus;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import passwords.Category;
import passwords.Frame;
import passwords.User;
import passwords.listeners.MouseListenerCategory;

/**
 *
 * @author rifleman
 */
public class MenuCategory {
    private Frame f;
    private JMenu catMenu;
    private JMenu[] accMenus;
    private MouseListenerCategory listener;
    private User user;
    
    public MenuCategory(Frame f) {
        this.listener = new MouseListenerCategory();
        this.f = f;
        
        this.menu = new JMenu("Passwords");
        this.bar = new JMenuBar();
        
        for (Category cat: user.getCategs()) {
            this.menu.add(cat.catMenu);
        }
        this.item = new JMenuItem("test");
        this.menu.addMouseListener(this.listener);
        this.bar.add(this.menu);
        this.f.setJMenuBar(bar);
        //this.f.repaint();
        this.f.setVisible(true);
    }
}
