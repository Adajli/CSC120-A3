import java.util.Scanner;
public class Conversation {
  //Attributes
  int rounds;
 
  public static void main(String[] arguments) {
    Scanner scan = new Scanner(System.in);
    int rounds = scan.nextInt();
    
    // You will start the conversation here.
    System.out.println("How many rounds?");
    System.out.println(rounds);  
  }
}
