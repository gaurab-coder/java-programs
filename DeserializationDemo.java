import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {
    public static void main(String[] args) {
        Student obj = null;

        try (FileInputStream fis = new FileInputStream("E:\\deletefiles\\sample.txt");
             ObjectInputStream in = new ObjectInputStream(fis)) {

            // Read the object
            obj = (Student) in.readObject();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        // Print object data
        if (obj != null) {
            System.out.println("ID: " + obj.id);
            System.out.println("Name: " + obj.name);
            System.out.println("Age: " + obj.age);
        } else {
            System.out.println("Deserialization failed!");
        }
    }
}