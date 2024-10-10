import java.util.ArrayList;
import java.util.Scanner;
/**
 * Ada Li 
 * CSC 120 Object Orientated Programming
 * A3:Chatbot Homework
*/
public class Conversation {
  //Attributes
  int rounds;
 
  /**
   * Conversation takes in attributes of rounds
   * prints only the response and returns nothing.
   */
  public static void main(String[] arguments) {
    Scanner input = new Scanner(System.in);
    String [] cannedResponses = {"Interesting", "Mm-hm", "Can you talk more about that?", "Oh really?"};
    ArrayList<String> transcript = new ArrayList<String>();
    /**
     * You will start the conversation here.
     * 
     */
    System.out.println("How many rounds would you like?? ");
    int rounds = input.nextInt(); /** asks for number of rounds */
    input.nextLine();
    System.out.println("Hello, what's on your mind?");/** Asks intro question. */
    transcript.add("Hello, what's on your mind?\n");/** Adds intro question to transcript. */
    for(int i = 0; i<rounds;i++){
      String response = input.nextLine();/** Asks for response input */
      transcript.add(response + "\n"); /** Adds responses to transcript. */
      String response2 = mirror(response);
      if(response2.substring(0,response.length()-1).equals(response.substring(0,response.length()-1))){ /*Checks for mirror words */
        int responseIndex = (int) (Math.random()*cannedResponses.length);
        System.out.println(cannedResponses[responseIndex]); 
        transcript.add(cannedResponses[responseIndex]+"\n");
      }else{   
        System.out.println(mirror(response));
        transcript.add(mirror(response)+"\n");
      } 
    }
    System.out.println("I was so delighted to talk to you."); /** Ends conversation. */
    transcript.add( "I was so delighted to talk to you.\n");
    System.out.println("Transcript:");
    for(int i = 0; i<transcript.size();i++){/** Prints out full transcript. */
      System.out.print(transcript.get(i));
    }
    input.close();
  
    
  }

  public static String mirror(String response){ /** Mirrors words */
    String [][] mirrorWords = {{"i", "you"} ,{"am", "are"},{ "my", "your"}, {"me", "you"},{"i'm", "you're"}, {"i'd", "you'd"},
  {"was", "were"},{"are", "am"}, {"your", "my"},{"you","me"}};
    String [] out = response.split(" ");

    for(int l = 0; l<out.length;l++){ /** Runs through out array */
      for(int j = 0; j<mirrorWords[l].length;j++){
        if(out[l].toLowerCase().equals(mirrorWords[j][0])){
          if(out[l].toLowerCase().equals("i") && out[l+1].toLowerCase().equals("am") && l<mirrorWords.length-1){
            out[l]= "you";
            out[l+1] = "are";
          }else if(out[l].toLowerCase().equals("you") && out[l+1].toLowerCase().equals("I") && l<mirrorWords.length-1){
            out[l]= "me";
            out[l+1] = "you";
          }else{
            out[l] = mirrorWords[j][1];
          }  
        }
               
      } 
    }
      
    StringBuilder outResult = new StringBuilder();  /** Idea of changing String to StringBuilder and generating toString for another variable from chatGPT for kudos part of handling capitalization, but I did not copy and paste the parts to change the function. */
    for(int k = 0; k<out.length;k++){
      if(k== out.length-1){
        outResult.append(out[k]);
      }else{
        outResult.append(out[k] + " ");
      }
    }
    String result = outResult.toString();
    result = result.substring(0,1).toUpperCase()+ result.substring(1);
    if(result.contains(".")){
      result = result.replace('.','?'); /** Replaces . with ? to continue conversation */
    }
      
    return result;
  }
} 
    
    
    
  
   
  

