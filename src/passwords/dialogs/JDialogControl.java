/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwords.dialogs;

import javax.swing.JDialog;

/**
 *
 * @author rifleman
 */
public class JDialogControl {
    private JDialog dialogForInsertUsers;
    private JDialog dialogForInsertCategorys;
    private JDialog dialogForInsertAccounts;
    
    private JDialog dialogForModifyUsers;
    private JDialog dialogForModifyCategorys;
    private JDialog dialogForModifyAccounts;
    
    public JDialogControl() {
        this.dialogForInsertCategorys = new JDialog();
        
    }
    public JDialogControl(JDialog dialogForInsertCategorys) {
        this.dialogForInsertCategorys = dialogForInsertCategorys;
    }
    
    
}
