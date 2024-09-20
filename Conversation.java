import java.util.Scanner;
public class Conversation {
  //Attributes
  int rounds;
 
  public static void main(String[] arguments) {
    Scanner input = new Scanner(System.in);
    
    // You will start the conversation here.
    System.out.println("How many rounds would you like??");
    int rounds = input.nextInt(); //asks for number of rounds  
    input.nextLine();
    System.out.println("Hello, what's on your mind?");
    for(int i = 0; i<rounds;i++){
      String response = input.next(); //asks for response
      input.nextLine();
      
        
    }
    System.out.println("I was so delighted to talk to you.");
  }
}
