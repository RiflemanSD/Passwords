/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package passwords;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 *
 * @author user01
 */
public class Account {
    private String name;
    private String pass;
    private String email;
    private String[] other;
    
    public Account(String name, String pass, String email) {
        this.name = name;
        this.pass = pass;
        this.email = email;
    }

    public Account(String name, String pass, String email, String... other) {
        this.name = name;
        this.pass = pass;
        this.email = email;
        this.other = other;
        
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String[] getOther() {
        return other;
    }

    public void setOther(String[] other) {
        this.other = other;
    }
    
}
