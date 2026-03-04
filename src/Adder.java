import java.util.ArrayList;

public class Adder {

    private boolean carry;

    public Adder(){
        carry = false;
    }

    public ArrayList<Boolean> add(ArrayList<Boolean> a, ArrayList<Boolean> b){
        ArrayList<Boolean> output = new ArrayList<>();
        carry = false;
        for(int x = 0; x < a.size(); x++){
            output.add(fullAdder(a.get(x), b.get(x)));
        }if(carry){
            output.add(carry);
        }
        return output;
    }

    private boolean fullAdder(boolean a, boolean b){
        carry = (a && b) || (carry && xor(a, b));
        return xor(carry, xor(a, b));
    }

    private boolean xor(boolean a, boolean b){
        return (a || b) && !(a && b);
    }

}
