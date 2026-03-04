import java.util.ArrayList;

public class Calculator {
    
    

    public static void main(String[] args) {
        TextInput reader = new TextInput();
        ArrayList<Calculation> test = reader.getEquation();
        
        for(Calculation calc : test){
            calc.printValues();
        }
        
        
    }

}
