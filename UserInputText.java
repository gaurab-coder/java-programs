// sum
import java.util.Scanner;
public class UserInputText {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("input the text:"); 
        String text=input.nextLine();
         System.out.println("Enter text is:"+text);
        input.close();
    }
}