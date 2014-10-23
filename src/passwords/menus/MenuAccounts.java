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
import passwords.Account;
import passwords.Category;
import passwords.Frame;
import passwords.User;
import passwords.listeners.MouseListenerAccount;
import passwords.listeners.MouseListenerCategory;

/**
 *
 * @author rifleman
 */
public class MenuAccounts {
    private Frame f;
    private Account acc;
    private JMenu accMenu;
    private JMenuItem[] values;
    private JMenuItem item;
    private MouseListenerAccount listener;
    private User user;
    
    public MenuAccounts(Frame f, Account acc) {
        this.listener = new MouseListenerAccount();
        this.f = f;
        this.acc = acc;
        
        this.accMenu = new JMenu(acc.getName());
        values = new JMenuItem[4];
        values[0] = new JMenuItem(this.acc.getName());
        values[1] = new JMenuItem(this.acc.getPass());
        values[2] = new JMenuItem(this.acc.getEmail());
        this.accMenu.add(values[0]);
        this.accMenu.add(values[1]);
        this.accMenu.add(values[2]);
    }
    public void addAccount() {
        
    }
    public void delAccount() {
        
    }
    public void modifyAccount() {
        
    }
    /*public MenuAccounts() {
        this.accMenu = new JMenu(this.name);
        values = new JMenuItem[3+other.length];
        values[0] = new JMenuItem(this.name);
        values[1] = new JMenuItem(this.pass);
        values[2] = new JMenuItem(this.email);
        this.accMenu.add(values[0]);
        this.accMenu.add(values[1]);
        this.accMenu.add(values[2]);
        for (int i = 3; i < other.length; i++) {
            values[i] = new JMenuItem(this.other[i-3]);
            this.accMenu.add(values[i]);
        }
    }*/
}
