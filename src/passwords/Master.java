/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwords;

import java.util.ArrayList;
import passwords.dialogs.DialogAccount;
import passwords.dialogs.ModifyAccountDialog;
import passwords.menus.MenuAccount;

/**
 *
 * @author rifleman
 */
public class Master {
    private Frame frame;
    
    private String[] newAccValues;
    private ModifyAccountDialog accDialog;
    
    private ArrayList<User> users;
    
    public Master() {
        Frame frame = new Frame();
        Account acc1 = new Account("kostas", "2000", "markos@hotmail.gr");
        Account acc2 = new Account("maria", "2020", "parko@hotmail.gr");
        Account acc3 = new Account("petros", "2020", "markos@gmail.gr");
        Account acc4 = new Account("bas", "3001", "markos2@hotmail.gr");
        
        ArrayList<Account> l1 = new ArrayList<>();
        ArrayList<Account> l2 = new ArrayList<>();
        l1.add(acc1);
        l2.add(acc2);
        l2.add(acc3);
        l2.add(acc4);
        
        Category cat1 = new Category("hotmail", l1);
        Category cat2 = new Category("mails", l2);
        
        ArrayList<Category> l3 = new ArrayList<>();
        l3.add(cat1);
        l3.add(cat2);
        User u = new User("markos" , "1002", l3);
    }
    
    public void addUser(User user) {
        this.users.add(user);
    }
    public void delUser(String name) {
        this.users.remove(this.getUserByName(name));
    }
    public User getUserByName(String name) {
        for (User user: this.users) {
            if (user.getName().equals(name)) return user;
        }
        return null;
    }
    
    public void getTextsFromAccDialog() {
        this.newAccValues = accDialog.getTexts();
    }

    public void closeModifyAccDialog() {
        this.accDialog.close();
    }
}
