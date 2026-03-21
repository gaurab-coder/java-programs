import java.util.Hashtable;

public class HashtableExample
{
    public static void main(String args[]) 
    {
        
      	// Create a Hashtable of String
      	// keys and Integer values
        Hashtable<String, Integer> ht = new Hashtable<>();

        // Adding elements to the Hashtable
        ht.put("One ", 1);
        ht.put("Two ", 2);
        ht.put("Three ", 3);
        ht.put("Four ", 4);
        ht.remove("Two ");
        
        // Displaying the Hashtable elements
        System.out.println("Hashtable Elements: " + ht);
    }
}