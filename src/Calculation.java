import java.util.ArrayList;

public class Calculation {
    
    private String operator;
    private ArrayList<Boolean> value;


    public Calculation(String op, String decimal){
        operator = op;
        value = converter(decimal);
    }

    public String getOperator(){
        return operator;
    }

    public ArrayList<Boolean> getValue(){
        return value;
    }

    private ArrayList<Boolean> converter(String decimalStr){
        ArrayList<Boolean> binary = new ArrayList<>();
        int decimal = Integer.parseInt(decimalStr);
        
        int max;
        for(max = 1; max < decimal; max *= 2){}
        max /= 2;
        for(int y = max; y > 0; y /= 2){
            if(decimal >= y){
                decimal -= y;
                binary.add(true);
            }else{
                binary.add(false);
            }
        }
        return binary;
    }
}
    
    
