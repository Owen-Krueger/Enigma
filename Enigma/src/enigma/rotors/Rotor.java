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
    
    public String rotorNum;
    public int[] wiring;
    public int numRotations;
    
    public Rotor(String rotorNum){
        this.rotorNum = rotorNum;
        this.wiring = wireFromFile(rotorNum);
        this.numRotations = 0;
    }
    
    public String getRotorNum(){
        return this.rotorNum;
    }
    
    public void setRotorNum(String rotorNum){
        this.rotorNum = rotorNum;
    }
    
    public int[] getWiring(){
        return this.wiring;
    }
    
    public void setWiring(int[] wiring){
        this.wiring = wiring;
    }
    
    public int getNumRotations(){
        return this.numRotations;
    }
    
    public void setNumRotations(int num){
        this.numRotations = num;
    }
    
    public void rotate(){
        int[] wiringCopy = new int[26];
        for(int i = 0; i < wiringCopy.length-1; i++){
            wiringCopy[i] = this.wiring[i+1];
        }
        wiringCopy[25] = this.wiring[0];
        this.numRotations++;
    }
    
    public int transcodeNum(int input){
        return wiring[input];
    }
    
    public int transcodeNumReflection(int input){
        for(int i = 0; i < wiring.length; i++){
            if(wiring[i] == input){
                return i;
            }
        }
        return -1;
    }
    
    private int[] wireFromFile(String rotorNum){
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
    
    private BufferedReader getFile(String rotorNum) throws FileNotFoundException{
        return new BufferedReader(new FileReader("src/enigma/rotors/" + rotorNum + ".csv"));
    }
}
