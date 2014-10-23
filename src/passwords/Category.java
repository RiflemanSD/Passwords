/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package passwords;

import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JMenu;

/**
 *
 * @author user01
 */
public class Category {
    private String name;
    private Icon icon;
    private ArrayList<Account> accounts;
    

    public Category(String name, ArrayList<Account> accounts) {
        this.name = name;
        this.accounts = accounts;
        this.catMenu = new JMenu(this.name);
        for (Account acc: accounts) {
            this.catMenu.add(acc.accMenu);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
    
    
}
