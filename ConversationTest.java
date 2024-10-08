import org.junit.*; 
import static org.junit.Assert.*; 
public class ConversationTest { 
    @Test 
    public void testMain() {  
        Conversation c = new Conversation();
        String response = "I am telling you that I am happy";
        assertEquals("You are telling me that you are happy",c.mirror(response));

    } 
}