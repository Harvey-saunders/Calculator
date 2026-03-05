import java.util.ArrayList;

public class Calculator {
    
    private static TextInput reader;
    private static Adder adder;

    public static void main(String[] args) {
        
        startUp();

        
        ArrayList<Calculation> calList = reader.getEquation();
        Calculation holder = calList.get(0);
        
        for(int x = 1; x < calList.size(); x++){
            Calculation calc = calList.get(x);
            switch (holder.getOperator()) {
                case "add":
                    holder = new Calculation(calc.getOperator(), adder.adding(holder.getValue(), calc.getValue()));
                    holder.printValues();
                    holder.printDecimal();
                    break;
            
                default:
                    System.out.println("error, no operand: " + calc.getOperator());
                    break;
            }
        }
    }

    private static void startUp(){
        reader = new TextInput();
        adder = new Adder();
    }

}
