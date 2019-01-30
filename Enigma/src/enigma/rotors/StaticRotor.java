package enigma.rotors;

/**
 *
 * @author Owen-Krueger
 */
public class StaticRotor {
    
    /**
     * Converts letter to number to put in rotor
     * @param input character being inputted
     * @return number that corresponds
     */
    public static int letterToNum(char input){
        final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        return(alphabet.indexOf(Character.toUpperCase(input)));
    }
    
    /**
     * Converts number to letter after rotor
     * @param input number being inputted
     * @return character that corresponds
     */
    public static char numToLetter(int input){
        final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        return(alphabet.charAt(input));
    }
}
