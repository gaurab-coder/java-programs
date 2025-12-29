class Student
{
    int age;
    String name;
    public Student()
    {
        name="gaurab";
        age=19;
        System.out.println("name:"+name);
        System.out.println("age:"+age);

    }
    public Student(Student s)
    {
        name=s.name;
        age=s.age;
        System.out.println("name:"+name);
        System.out.println("age:"+age);
    }
}
public class CopyConstructorDemo
{
    public static void main(String afeere[])
    {
        Student s1=new Student();
        Student s2=new Student(s1);
        }
}