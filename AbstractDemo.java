// Abstract class
abstract class Animal {

    // Abstract method (no body)
    abstract void makeSound();

    // Normal method
    void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

// Subclass (Child class)
class Dog extends Animal {

    // Providing implementation of abstract method
    void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {

        // Animal a = new Animal();  ❌ Not allowed (cannot create object of abstract class)

        Animal obj = new Dog();  // Upcasting

        obj.makeSound();  // Calls Dog's method
        obj.sleep();      // Calls normal method from Animal class
    }
}