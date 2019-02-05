/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enigma.errors;

import javax.swing.JOptionPane;

/**
 *
 * @author okrueger
 */
public class InvalidConfig extends Error{
    
    public InvalidConfig(){
        super("One or more of your components are bad. Please try again");
        JOptionPane.showMessageDialog(null, "One or more of your components are bad. Please try again");
    }
    
    public InvalidConfig(String message){
        super(message);
        JOptionPane.showMessageDialog(null, message);
    }
}
