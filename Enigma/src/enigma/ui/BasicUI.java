package enigma.ui;
import enigma.rotors.Rotor;
import enigma.rotors.RotorGroup;
import enigma.rotors.StaticRotor;
import java.util.Scanner;

/**
 *
 * @author Owen-Krueger
 */
public class BasicUI {
    
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        Rotor rotor1 = new Rotor(scan.next());
        Rotor rotor2 = new Rotor(scan.next());
        Rotor rotor3 = new Rotor(scan.next());
        Rotor reflector = new Rotor(scan.next());
        
        RotorGroup rg = new RotorGroup(rotor1, rotor2, rotor3, reflector);
        
        System.out.println(StaticRotor.numToLetter(rg.calculateLetter('h')));
        System.out.println(StaticRotor.numToLetter(rg.calculateLetter('i')));
        System.out.println(StaticRotor.numToLetter(rg.calculateLetter('h')));
        System.out.println(StaticRotor.numToLetter(rg.calculateLetter('i')));
        //String next = scan.next();
        //System.out.print(next);
        
        MainUI mu = new MainUI();
        mu.setVisible(true);
    }
}
