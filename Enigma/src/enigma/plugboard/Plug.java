package enigma.plugboard;

/**
 *
 * @author Owen-Krueger
 */
public class Plug {
    
    char start;
    char end;
    
    public Plug(char start, char end){
        this.start = Character.toUpperCase(start);
        this.end = Character.toUpperCase(end);
    }
    
    public char getStart(){
        return this.start;
    }
    
    public void setStart(char start){
        this.start = Character.toUpperCase(start);
    }
    
    public char getEnd(){
        return this.end;
    }
    
    public void setEnd(char end){
        this.end = Character.toUpperCase(end);
    }
}
