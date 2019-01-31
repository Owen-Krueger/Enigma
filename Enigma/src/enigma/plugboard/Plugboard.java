package enigma.plugboard;

/**
 *
 * @author Owen-Krueger
 */
public class Plugboard {
    
    Plug[] plugs = new Plug[10];
    
    public Plugboard(){
        
    }
    
    public Plugboard(Plug[] plugs){
        if(this.plugs.length == plugs.length){
            this.plugs = plugs;
        }
    }
    
    public boolean checkPlugs(char checked){
        checked = Character.toUpperCase(checked);
        for (Plug plug : plugs) {
            if (plug.start == checked || plug.end == checked) {
                return true;
            }
        }
        return false;
    }
    
    public char replaceChar(char checked){
        checked = Character.toUpperCase(checked);
        for (Plug plug : plugs) {
            if(plug.start == checked){
                return plug.end;
            }
            if(plug.end == checked){
                return plug.start;
            }
        }
        return checked;
    }
    
}
