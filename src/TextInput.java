import java.util.Scanner;
import java.util.ArrayList;

public class TextInput {
    
    private Scanner reader;

    public TextInput(){
        reader = new Scanner(System.in);
    }

    public ArrayList<Calculation> getEquation(){
        System.out.println("Enter Equestion");
        String input = reader.nextLine();
        return split(input);
    }

    private ArrayList<Calculation> split(String input){

        ArrayList<Calculation> split = new ArrayList<>();
        String[] inputSplit = input.split(" ");

        String holder = "";
        for(int x = 0; x < inputSplit.length; x++){
            if(x == (inputSplit.length - 1)){
                split.add(new Calculation("end", inputSplit[x]));
            }else if(holder.equals("")){
                holder = inputSplit[x];
            }else{
                switch (inputSplit[x]) {
                    case "+":
                        split.add(new Calculation("add", holder));
                        holder = "";
                        break;
                    case "-":
                        split.add(new Calculation("sub", holder));
                        break;
                    default:
                        System.out.println("Invalid format");
                        break;
                }
            }
        }
        return split;
    }
}
