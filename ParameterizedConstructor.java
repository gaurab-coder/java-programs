class Student
{
    int id;
    String name;
    public Student(int i,String n)
    {
        id=i;
        name=n;
    }
    public void display()
    {
        System.err.println(id+" "+name);

    }
    
}
public class ParameterizedConstructor
{
    public static void main(String ar[])
    {
        Student o=new Student(100,"gaurab");
        Student o1=new Student(101,"rahul");
        o.display();
        o1.display();
    }
}
       