import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        // Creating a Vector
        Vector<String> names = new Vector<>();

        // Adding elements
        names.add("Gaurab");
        names.add("Akhil");
        names.add("Ram");
        names.add("Sita");

        // Displaying Vector
        System.out.println("Vector elements: " + names);

        // Accessing element
        System.out.println("First element: " + names.get(0));

        // Removing element
        names.remove("Ram");

        // Size of Vector
        System.out.println("Size after removal: " + names.size());

        // Checking capacity
        System.out.println("Capacity: " + names.capacity());
    }
}