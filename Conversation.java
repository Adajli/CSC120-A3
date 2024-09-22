import java.util.Scanner;
public class Conversation {
  //Attributes
  int rounds;

 
 
  public static void main(String[] arguments) {
    Scanner input = new Scanner(System.in);
    String [] cannedResponses = {"Interesting", "Mm-hm", "Can you talk more about that?", "Oh really?"};
    // You will start the conversation here.
    System.out.println("How many rounds would you like?? ");
    int rounds = input.nextInt(); //asks for number of rounds
    input.nextLine();
    System.out.println("Hello, what's on your mind?");// Asks intro question.
    for(int i = 0; i<rounds;i++){
      String response = input.nextLine(); //asks for response
      mirror(response);
      int responseIndex = (int) (Math.random()*cannedResponses.length);
      System.out.println(cannedResponses[responseIndex]); 
      } 
      //System.out.println(out);   
      System.out.println("I was so delighted to talk to you."); // Ends conversation. 
    }

    public void mirror(String response){
      String [][] mirrorWords = {{"i", "you"} ,{"am", "are"},{ "my", "your"}, {"me", "you"},{"i'm", "you're"}, {".", "?"} };
      String out = "";
      for(int l = 0; l<response.length();l++){ //Runs through response variable.
        for(int j = 0; j<mirrorWords.length;j++){
          for(int k = 0; k<mirrorWords[j].length;k++){
            if(response.toLowerCase().contains(mirrorWords[j][k])){
              response += mirrorWords[j][k];
              int spaceIndex = response.indexOf(" ");
              if (spaceIndex >= 0) {
                out += response.substring(spaceIndex, response.indexOf(".")); // Appends the rest of the response after the space
              }  
            }         
          } 
       }
      }
      System.out.println(out);
    }
} 
    
    
    
  
   
  

