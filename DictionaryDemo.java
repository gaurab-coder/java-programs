import java.util.Dictionary;
import java.util.Hashtable;

public class DictionaryDemo
{
    public static void main(String[] args)
    {
        Dictionary<Integer, String> dict = new Hashtable<Integer, String>();

        dict.put(1, "Nepal");
        dict.put(2, "India");

        System.out.println("Key 1: " + dict.get(1));
        System.out.println("Key 2: " + dict.get(2));
    }
}