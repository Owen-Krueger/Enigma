package enigma.rotors;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Owen-Krueger
 */
public class Rotor {
    
    public int rotorNum;
    public int[] wiring;
    
    public Rotor(int rotorNum){
        this.rotorNum = rotorNum;
        this.wiring = getWiring(rotorNum);
    }
    
    public int getRotorNum(){
        return this.rotorNum;
    }
    
    public void setRotorNum(int rotorNum){
        this.rotorNum = rotorNum;
    }
    
    public int[] getWiring(){
        return this.wiring;
    }
    
    public void setWiring(int[] wiring){
        this.wiring = wiring;
    }
    
    public int transcodeNum(int input){
        return wiring[input];
    }
    
    private int[] getWiring(int rotorNum){
        try {
            BufferedReader br = getFile(rotorNum);
            String line = br.readLine();
            String[] wiringString = line.split(",");
            int[] wiringInt = new int[26];
            
            for(int i = 0; i < wiringInt.length; i++){
                wiringInt[i] = Integer.parseInt(wiringString[i]);
            }
            
            br.close();
            return wiringInt;
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch(IOException io){
            io.printStackTrace();
        }
        
        return null;
    }
    
    private BufferedReader getFile(int rotorNum) throws FileNotFoundException{
        return new BufferedReader(new FileReader("src/enigma/rotors/" + rotorNum + ".csv"));
    }
}
