import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Iterator;
public class TreeSetExample
{
    public static void main (String[] ej)
    {
        SortedSet<String> set=new TreeSet<>();
        set.add("Toyota");
        set.add("Honda");
        set.add("Ford");
        set.add("BMW");
        System.out.println("Sorted Set: "+set);
        set.add("Audi");
        System.out.println("Updated Sorted Set: "+set);
        set.remove("Ford");
        System.out.println("After Removing Ford: "+set);
    }
}