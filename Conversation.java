import java.util.Arrays;
import java.util.Scanner;
public class Conversation {
  //Attributes
  int rounds;

 
 
  public static void main(String[] arguments) {
    Scanner input = new Scanner(System.in);
    String [] cannedResponses = {"Interesting", "Mm-hm", "Can you talk more about that?", "Oh really?"};
    String transcript = "";
    // You will start the conversation here.
    System.out.println("How many rounds would you like?? ");
    transcript += "How many rounds would you like?? \n";
    int rounds = input.nextInt(); //asks for number of rounds
    transcript += rounds;
    System.out.println("Hello, what's on your mind?");// Asks intro question.
    transcript +="Hello, what's on your mind?\n";
    Scanner input2 = new Scanner(System.in);
    for(int i = 0; i<rounds;i++){
      String response = input2.nextLine(); //asks for response
      
      //System.out.println("In loop");
      //String response = input.nextLine(); //asks for response
      //System.out.println("Response: "+response);  
      //System.out.println("Response2: "+mirror(response));   
      String response2 = mirror(response);
      transcript += response2 +"\n";
      //String response2 = "m";
      
      if(response2.equals(response)){
        int responseIndex = (int) (Math.random()*cannedResponses.length);
        System.out.println(cannedResponses[responseIndex]); 
        transcript += cannedResponses[responseIndex]+"\n";
      }else{   
        System.out.println(mirror(response));
        transcript += mirror(response)+"\n";
      } 
    }
    System.out.println("I was so delighted to talk to you."); // Ends conversation. 
    transcript += "I was so delighted to talk to you.\n";
    System.out.println("Transcript");
    System.out.println(transcript);
    input.close();
    input2.close();

       
    //System.out.println(out);   
    
  }

    public static String mirror(String response){
      String [][] mirrorWords = {{"i", "you"} ,{"am", "are"},{ "my", "your"}, {"me", "you"},{"i'm", "you're"} };
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
      return outResult;
    }
} 
    
    
    
  
   
  

