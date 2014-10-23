/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package passwords;

import java.util.ArrayList;
import javax.swing.Action;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import passwords.listeners.MouseListenerCategory;

/**
 *
 * @author user01
 */
public class User {
    private String name;
    private String pass;
    private ArrayList<Category> categs;


    public User(String name, String pass, ArrayList<Category> categs) {
        this.name = name;
        this.pass = pass;
        this.categs = categs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public ArrayList<Category> getCategs() {
        return categs;
    }

    public void setCategs(ArrayList<Category> categs) {
        this.categs = categs;
    }
    
    
}
