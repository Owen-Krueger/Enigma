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
    
    /**
     * Constructor
     * @param rotorNum rotor 1-5 to insert 
     */
    public Rotor(String rotorNum){
        this.rotorNum = rotorNum;
        this.wiring = wireFromFile(rotorNum);
        this.numRotations = 0;
    }
    
    /**
     * Returns the rotor number
     * @return String rotor num
     */
    public String getRotorNum(){
        return this.rotorNum;
    }
    
    /**
     * Sets rotor number
     * @param rotorNum String rotor num/name
     */
    public void setRotorNum(String rotorNum){
        this.rotorNum = rotorNum;
    }
    
    /**
     * Get wiring (connections) array
     * @return array of connections
     */
    public int[] getWiring(){
        return this.wiring;
    }
    
    /**
     * Set wiring array
     * @param wiring array of connections
     */
    public void setWiring(int[] wiring){
        this.wiring = wiring;
    }
    
    /**
     * Get number of times rotated
     * @return int number of rotations
     */
    public int getNumRotations(){
        return this.numRotations;
    }
    
    /**
     * Set number of rotations
     * @param num int number of rotations
     */
    public void setNumRotations(int num){
        this.numRotations = num;
    }
    
    /**
     * Rotate rotor and change connections
     */
    public void rotate(){
        int[] wiringCopy = new int[26];
        for(int i = 0; i < wiringCopy.length-1; i++){
            wiringCopy[i] = this.wiring[i+1];
        }
        wiringCopy[25] = this.wiring[0];
        if(this.numRotations == 25){
            this.numRotations = 0;
        }
        else {
            this.numRotations++;
        }
    }
    
    /**
     * Get connection from input number
     * @param input number being input
     * @return int number connected
     */
    public int transcodeNum(int input){
        return wiring[input];
    }
    
    /**
     * Get connection from input number (after reflection)
     * @param input number being input
     * @return int number connected
     */
    public int transcodeNumReflection(int input){
        for(int i = 0; i < wiring.length; i++){
            if(wiring[i] == input){
                return i;
            }
        }
        return -1;
    }
    
    /**
     * Get wiring from file
     * @param rotorNum name of file
     * @return array of wiring connections
     */
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
    
    /**
     * Get BufferedReader from file
     * @param rotorNum name of file
     * @return BufferedReader for reading file
     * @throws FileNotFoundException file not found
     */
    private BufferedReader getFile(String rotorNum) throws FileNotFoundException{
        return new BufferedReader(new FileReader("src/enigma/rotors/" + rotorNum + ".csv"));
    }
}
