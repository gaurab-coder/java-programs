import java.util.Hashtable;

public class HashtableDemo
{
    public static void main(String[] args)
    {
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

        ht.put(1, "Nepal");
        ht.put(2, "India");
        ht.put(3, "China");

        System.out.println("Hashtable: " + ht);

        ht.remove(2);

        System.out.println("After removing key 2: " + ht);
    }
}