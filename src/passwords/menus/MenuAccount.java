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
import javax.swing.JSeparator;
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
public class MenuAccount {
    private Account acc;
    private JMenu accMenu;
    private JMenuItem[] values;
    private JMenuItem modify;
    private JMenuItem delete;
    private User user;
    
    public MenuAccount(Account acc, MouseListenerAccount modifyListener, MouseListenerAccount deleteListener) {
        this.acc = acc;
        
        this.modify = new JMenu("Modify");
        this.modify.addMouseListener(modifyListener);
        this.delete = new JMenu("Delete");
        this.delete.addMouseListener(deleteListener);
        this.accMenu = new JMenu(acc.getName());
        values = new JMenuItem[4];
        values[0] = new JMenuItem(this.acc.getName());
        values[1] = new JMenuItem(this.acc.getPass());
        values[2] = new JMenuItem(this.acc.getEmail());
        this.accMenu.add(values[0]);
        this.accMenu.add(values[1]);
        this.accMenu.add(values[2]);
        this.accMenu.add(new JSeparator());
        this.accMenu.add(this.modify);
        this.accMenu.add(this.delete);
    }

    public void modifyAccount(String[] values) {
        this.acc.setName(values[0]);
        this.acc.setPass(values[1]);
        this.acc.setEmail(values[2]);
        this.values[0].setText(values[0]);
        this.values[1].setText(values[1]);
        this.values[2].setText(values[2]);
    }
    public void deleteAccount() {
        this.accMenu.removeAll();
        this.accMenu.revalidate();
        this.acc = null;
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
