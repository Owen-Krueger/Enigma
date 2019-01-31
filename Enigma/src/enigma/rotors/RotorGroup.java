package enigma.rotors;

/**
 *
 * @author Owen-Krueger
 */
public class RotorGroup {
    
    Rotor rotor1;
    Rotor rotor2;
    Rotor rotor3;
    Rotor reflector;
    
    public RotorGroup(Rotor r1, Rotor r2, Rotor r3, Rotor reflector){
        this.rotor1 = r1;
        this.rotor2 = r2;
        this.rotor3 = r3;
        this.reflector = reflector;
    }
    
    public int calculateLetter(char letter){
        int num = StaticRotor.letterToNum(letter);
        
        num = rotor1.transcodeNum(num);
        
        num = rotor2.transcodeNum(num);
        
        num = rotor3.transcodeNum(num);
        
        num = reflector.transcodeNum(num);
        
        num = rotor3.transcodeNumReflection(num);
        
        num = rotor2.transcodeNumReflection(num);
        
        num = rotor1.transcodeNumReflection(num);
        
        rotor1.rotate();
        if(rotor1.numRotations == 0){
            rotor2.rotate();
            if(rotor2.numRotations == 0){
                rotor3.rotate();
            }
        }
        
        return num;
    }
    
}
