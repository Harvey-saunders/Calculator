import java.util.ArrayList;

public class Opertations {

    public boolean carry;
    private ArrayList<Boolean> larger;
    private ArrayList<Boolean> smaller;
    private int sizeDiff;

    public Opertations(){
        carry = false;
        sizeDiff = 0;
    }

    public ArrayList<Boolean> adding(ArrayList<Boolean> a, ArrayList<Boolean> b){
        ArrayList<Boolean> output = new ArrayList<>();
        carry = false;

        findBiggest(a, b);

        for(int x = 0; x < sizeDiff; x++){
            output.add(larger.get(x));
        }for(int x = 0; x < smaller.size(); x++){
            output.add(fullAdder(larger.get(x + sizeDiff), smaller.get(x)));
        }
        if(carry){
            output.add(carry);
        }


        return output;
    }

    public boolean fullAdder(boolean a, boolean b){
        boolean output = xor(carry, xor(a, b));
        boolean carryholder = carry;
        carry = (a && b) || (carryholder && xor(a, b));
        return output;
    }

    private boolean xor(boolean a, boolean b){
        return (a || b) && !(a && b);
    }

    private void findBiggest(ArrayList<Boolean> a, ArrayList<Boolean> b){
        if(a.size() > b.size()){
            larger = a;
            smaller = b;
        }else{
            larger = b;
            smaller = a;
        }sizeDiff = larger.size() - smaller.size();
    }

}
