//Constructors Demo
class Student {

    String name;
    int age;

    // 1. No-argument constructor
    Student() {
        name = "Unknown";
        age = 0;
        System.out.println("No-argument constructor called");
    }

    // 2. Parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
        System.out.println("Parameterized constructor called");
    }

    // 3. Copy constructor
    Student(Student s) {
        name = s.name;
        age = s.age;
        System.out.println("Copy constructor called");
    }

    // 4. Private constructor
    private Student(String n) {
        name = n;
        age = 18;
        System.out.println("Private constructor called");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        // No-argument constructor
        Student s1 = new Student();
        s1.display();

        System.out.println();

        // Parameterized constructor
        Student s2 = new Student("Gaurab", 20);
        s2.display();

        System.out.println();

        // Copy constructor
        Student s3 = new Student(s2);
        s3.display();

        System.out.println();

        // Private constructor (can be accessed only inside same class)
        Student s4 = new Student("PrivateStudent");
        s4.display();
    }
}
