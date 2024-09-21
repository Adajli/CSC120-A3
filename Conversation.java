import java.util.Scanner;
public class Conversation {
  //Attributes
  int rounds;
  boolean match;
  public static void main(String[] arguments) {
    Scanner input = new Scanner(System.in);
    String [][] mirrorWords = {{"i", "you"} ,{"am", "are"},{ "my", "your"}, {"me", "you"},{"i'd", "you'd"}};
    String [] cannedResponses = {"Interesting", "Mm-hm", "Can you talk more about that?", "Oh really?"};
    // You will start the conversation here.
    System.out.println("How many rounds would you like??");
    int rounds = input.nextInt(); //asks for number of rounds
    
    input.nextLine();
    System.out.println("Hello, what's on your mind?");
    for(int i = 0; i<rounds;i++){
      String response = input.nextLine(); //asks for response
      boolean match = false;  
      for(int j = 0; j < mirrorWords.length; j++){
        for(int k = 0; k < mirrorWords[j].length; k++){
          if(response.toLowerCase().contains(mirrorWords[j][k])){
            int spaceIndex = response.indexOf(" ");
            String out = mirrorWords[j][k];
            if (spaceIndex >= 0) {
                out += response.substring(spaceIndex); // Append the rest of the response after the space
            }
            match = true;
            System.out.println(out);
            break;
          }
        }
        if(match==true){
          break;
        }
      } 
      if(!match){
        int responseIndex = (int) (Math.random()*cannedResponses.length);
        System.out.println(cannedResponses[responseIndex]);
      }
      
    }
    System.out.println("I was so delighted to talk to you.");  
  }
}
