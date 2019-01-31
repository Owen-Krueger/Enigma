package enigma;

import enigma.plugboard.Plugboard;
import enigma.rotors.Rotor;
import enigma.rotors.RotorGroup;
import enigma.rotors.StaticRotor;

/**
 *
 * @author Owen-Krueger
 */
public class Enigma {

    RotorGroup rg;
    Plugboard pb;
    
    public Enigma(){
        
    }
    
    public Enigma(RotorGroup rg, Plugboard pb){
        this.rg = rg;
        this.pb = pb;
    }
    
    public char runLetter(char letter){
        letter = pb.replaceChar(letter);
        rg.calculateLetter(letter);
        letter = pb.replaceChar(letter);
        return letter;
    }
        
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
