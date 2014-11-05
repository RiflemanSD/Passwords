/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwords.menus;

import java.util.ArrayList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import passwords.Frame;
import passwords.User;
import passwords.listeners.MouseListenerUser;

/**
 *
 * @author rifleman
 */
public class MenuUser {
    private JMenuBar bar;
    private User user;
    
    private JMenu userMenu;
    private JMenuItem modifyUser;
    private JMenuItem deleteUser;
    private JMenuItem addCat;
    
    private ArrayList<MenuCategory> catMenus;
    
    public MenuUser(JMenuBar bar, User user, MouseListenerUser modifyListener, MouseListenerUser deleteListener, MouseListenerUser addListener) {
        this.user = user;
        this.bar = bar;
        
        this.modifyUser = new JMenu("Modify user");
        this.modifyUser.addMouseListener(modifyListener);
        this.deleteUser = new JMenu("Delete user");
        this.deleteUser.addMouseListener(deleteListener);
        this.addCat = new JMenu("Add category");
        this.addCat.addMouseListener(addListener);
        
        this.userMenu = new JMenu(user.getName());
        
        this.userMenu.add(this.modifyUser);
        this.userMenu.add(this.deleteUser);
        this.userMenu.add(this.addCat);
        this.userMenu.add(new JSeparator());
        
        this.catMenus = new ArrayList<MenuCategory>();
        bar.add(this.userMenu);
    }

    public void modifyUser(String name, String pass) {
        this.user.setName(name);
        this.user.setPass(pass);
        this.userMenu.setText(name);
    }
    public void deleteUser() {
        this.userMenu.removeAll();
        this.userMenu.revalidate();
        this.user = null;
    }
    public void addCategory(MenuCategory cat) {
        this.catMenus.add(cat);
        this.userMenu.add(cat.getMenu());
    }
    public void delCategory(MenuCategory cat) {
        this.catMenus.remove(cat);
        this.userMenu.remove(cat.getMenu());
    }
    public boolean checkPassword(String pass) {
        return this.user.getPass().equals(pass);
    }
    public MenuCategory getCatByName(String name) {
        for (MenuCategory cat: this.catMenus) {
            if (cat.getCategory().getName().equals(name)) return cat;
        }
        return null;
    }
}
