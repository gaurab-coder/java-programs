import java.util.Vector;
import java.util.Iterator;

public class VectorIteratorExample {
    public static void main(String[] args) {

        // Creating Vector
        Vector<String> cities = new Vector<>();

        // Adding elements
        cities.add("Kathmandu");
        cities.add("Pokhara");
        cities.add("Lalitpur");
        cities.add("Biratnagar");

        // Displaying using Iterator
        System.out.println("Cities in Vector:");
        Iterator<String> itr = cities.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Checking if element exists
        System.out.println("Contains Pokhara? " + cities.contains("Pokhara"));

        // First and Last element
        System.out.println("First City: " + cities.firstElement());
        System.out.println("Last City: " + cities.lastElement());

        // Removing element by index
        cities.remove(2);

        System.out.println("After removing index 2: " + cities);
    }
}