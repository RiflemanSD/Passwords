/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwords;

import java.util.ArrayList;
import passwords.dialogs.DialogAccount;
import passwords.menus.MenuAccounts;

/**
 *
 * @author rifleman
 */
public class Master {
    private Frame frame;
    private MenuAccounts mAcc;
    
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
}
