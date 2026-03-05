import java.util.ArrayList;

public class Calculation {
    
    private String operator;
    private ArrayList<Boolean> value;


    public Calculation(String op, String decimal){
        operator = op;
        value = converter(decimal);
    }

    public Calculation(String op, ArrayList<Boolean> val){
        operator = op;
        value = val;
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
        for(max = 1; max <= decimal; max *= 2){}
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

    public void printValues(){
        System.out.println(getOperator() + " " + getValue());
    }

    public void printDecimal(){
        int decimal = 0;
        int binary = 1;
        for(int x = value.size() - 1; x >= 0; x--){
            if(value.get(x)){
                decimal += binary;
            }binary *= 2;
        }System.out.println(decimal);
    }
}
    
    
