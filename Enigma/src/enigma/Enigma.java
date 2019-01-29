package enigma;

import enigma.rotors.Rotor;
import enigma.rotors.StaticRotor;

/**
 *
 * @author Owen-Krueger
 */
public class Enigma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {            
        int num = StaticRotor.letterToNum('k');
                
        Rotor rotor = new Rotor("Rotor1");
        num = rotor.transcodeNum(num);
        System.out.print(StaticRotor.numToLetter(num));
        
        num = rotor.transcodeNumReflection(num);
        System.out.print(StaticRotor.numToLetter(num));
    }
    
}
