package enigma.ui;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Owen-Krueger
 */
public class MainUI extends JFrame{
    
    public MainUI(){
        super("Enigma");
        setSize(200,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void createRotors(){
        JLabel title = new JLabel("Reflector");
        add(title);
    }
    
    private void createKeyboard(){
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 9; j++){
                //paintKey(i, j, 'a');
            }
        }
    }
    
}
