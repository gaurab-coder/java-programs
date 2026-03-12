import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class Student implements Serializable
{
    int id;
    String name;
    int age;

    public Student(int id, String name, int age)
    {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

public class SerializableDemo
{
    public static void main(String[] args)
    {
        try
        {
            Student obj = new Student(1001, "Gaurav", 20);

            FileOutputStream fos = new FileOutputStream("E:\\deletefiles\\sample.txt");
            ObjectOutputStream out = new ObjectOutputStream(fos);

            out.writeObject(obj);

            out.close();
            fos.close();

            System.out.println("Data is serialized successfully");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
