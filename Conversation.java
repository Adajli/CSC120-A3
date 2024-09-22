import java.util.Arrays;
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
      if(response.contains("Nothing")){
        int responseIndex = (int) (Math.random()*cannedResponses.length);
        System.out.println(cannedResponses[responseIndex]); 
      }else{
        System.out.println(mirror(response));
      }
      } 
      //System.out.println(out);   
      System.out.println("I was so delighted to talk to you."); // Ends conversation. 
    }

    public static String mirror(String response){
      String [][] mirrorWords = {{"i", "you"} ,{"am", "are"},{ "my", "your"}, {"me", "you"},{"i'm", "you're"}, {".", "?"} };
      String [] out = response.split(" ");

      for(int l = 0; l<out.length;l++){ //Runs through response variable.
        for(int j = 0; j<mirrorWords.length;j++){
          System.out.println(out[l].toLowerCase());
            if(out[l].toLowerCase().equals(mirrorWords[j][0])){
              out[l] = mirrorWords[j][1];
            }         
          } 
       }
      System.out.println(Arrays.toString(out));
      String outResult = " ";
      for(int k = 0; k<out.length;k++){
        outResult += out[k] + " ";
      }
      return outResult.trim();
    }
} 
    
    
    
  
   
  

