/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwords.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import passwords.Master;

/**
 *
 * @author rifleman
 */
public class CancelButtonListener implements ActionListener {
    private Master master;
    
    public CancelButtonListener(Master master) {
        this.master = master;
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        this.master.closeModifyAccDialog();
    }
}
