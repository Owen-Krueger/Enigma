package enigma.rotors;

/**
 *
 * @author Owen-Krueger
 */
public class StaticRotor {
    
    public static int letterToNum(char input){
        final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        return(alphabet.indexOf(Character.toUpperCase(input)));
    }
    
    public static char numToLetter(int input){
        final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        return(alphabet.charAt(input));
    }
}
