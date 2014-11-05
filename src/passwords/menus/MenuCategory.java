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
import passwords.listeners.MouseListenerCategory;

/**
 *
 * @author rifleman
 */
public class MenuCategory {
    private Category cat;
    private JMenu catMenu;
    private JMenuItem modifyCategory;
    private JMenuItem deleteCategory;
    private JMenuItem addAccount;
    
    private ArrayList<JMenu> accMenus;
    private MouseListenerCategory modifyListener;
    private MouseListenerCategory deleteListener;
    
    public MenuCategory(Category cat, MouseListenerCategory modifyListener, MouseListenerCategory deleteListener, MouseListenerCategory addListener) {
        this.cat = cat;
        
        this.modifyCategory = new JMenu("Modify Category");
        this.modifyCategory.addMouseListener(modifyListener);
        this.deleteCategory = new JMenu("Delete Category");
        this.deleteCategory.addMouseListener(deleteListener);
        this.addAccount = new JMenu("Add account");
        this.addAccount.addMouseListener(addListener);
        
        this.catMenu = new JMenu(cat.getName());
        
        this.catMenu.add(this.modifyCategory);
        this.catMenu.add(this.deleteCategory);
        this.catMenu.add(this.addAccount);
        this.catMenu.add(new JSeparator());
        
        this.accMenus = new ArrayList<JMenu>();
    }

    public void modifyCategory(String name) {
        this.cat.setName(name);
        this.catMenu.setText(name);
    }
    public void deleteCategory() {
        this.catMenu.removeAll();
        this.catMenu.revalidate();
        this.cat = null;
    }
    public void addAccount(JMenu acc) {
        this.accMenus.add(acc);
        this.catMenu.add(acc);
    }
    public JMenu getMenu() {
        return this.catMenu;
    }
    public Category getCategory() {
        return this.cat;
    }
}
