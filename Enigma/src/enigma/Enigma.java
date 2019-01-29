package enigma;

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
        System.out.println(StaticRotor.letterToNum('k'));
        System.out.println(StaticRotor.numToLetter(10));
    }
    
}
