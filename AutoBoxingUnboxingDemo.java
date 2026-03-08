public class AutoBoxingUnboxingDemo {
    public static void main(String[] args) {

        // Autoboxing (primitive → object)
        int a = 10;
        Integer obj = a;   // automatic conversion
        System.out.println("Autoboxing value: " + obj);

        // Unboxing (object → primitive)
        Integer b = 20;
        int num = b;       // automatic conversion
        System.out.println("Unboxing value: " + num);
    }
}