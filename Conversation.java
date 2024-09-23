import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Conversation {
  //Attributes
  int rounds;

 
 
  public static void main(String[] arguments) {
    Scanner input = new Scanner(System.in);
    String [] cannedResponses = {"Interesting", "Mm-hm", "Can you talk more about that?", "Oh really?"};
    ArrayList<String> transcript = new ArrayList<String>();
    // You will start the conversation here.
    System.out.println("How many rounds would you like?? ");
    int rounds = input.nextInt(); //asks for number of rounds
    System.out.println("Hello, what's on your mind?");// Asks intro question.
    transcript.add("Hello, what's on your mind?\n");
    Scanner input2 = new Scanner(System.in);
    for(int i = 0; i<rounds;i++){
      String response = input2.nextLine(); //asks for response
      transcript.add(response + "\n");
      String response2 = mirror(response);
      
      // transcript.add(response2 +"\n");
      //String response2 = "m";
      
      if(response2.substring(0,response.length()-1).equals(response.substring(0,response.length()-1)) ){
        int responseIndex = (int) (Math.random()*cannedResponses.length);
        System.out.println(cannedResponses[responseIndex]); 
        transcript.add(cannedResponses[responseIndex]+"\n");
      }else{   
        System.out.println(mirror(response));
        transcript.add(mirror(response)+"\n");
      } 
    }
    System.out.println("I was so delighted to talk to you."); // Ends conversation. 
    transcript.add( "I was so delighted to talk to you.\n");
    System.out.println("Transcript:");
    for(int i = 0; i<transcript.size();i++){
      System.out.print(transcript.get(i));
    }
    input.close();
    input2.close();

       
    //System.out.println(out);   
    
  }

    public static String mirror(String response){
      String [][] mirrorWords = {{"i", "you"} ,{"am", "are"},{ "my", "your"}, {"me", "you"},{"i'm", "you're"}, {"i'd", "you'd"}};
      String [] out = response.split(" ");

      for(int l = 0; l<out.length;l++){ //Runs through response variable.
        for(int j = 0; j<mirrorWords.length;j++){
          //System.out.println(out[l].toLowerCase());
            if(out[l].toLowerCase().equals(mirrorWords[j][0])){
              out[l] = mirrorWords[j][1];
            }         
          } 
       }
      
      String outResult = "";
      for(int k = 0; k<out.length;k++){
        if(k== out.length-1){
          outResult += out[k];
        }else{
          outResult += out[k] + " ";
        }
      }
      if(outResult.contains(".")){
        outResult = outResult.replace('.','?');
      }
      //System.out.println(outResult.contains("."));
      return outResult;
    }
} 
    
    
    
  
   
  

