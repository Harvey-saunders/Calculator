import java.util.Scanner;

public class TextInput {
    
    private Scanner reader;

    public TextInput(){
        reader = new Scanner(System.in);
    }

    public String getEquation(){
        System.out.println("Enter Equestion");
        return reader.nextLine();
    }

}
