class University
{
    private String name = "TU Nepal";

    class Department   // Member Inner Class
    {
        void showDepartment()
        {
            System.out.println("University Name: " + name);
            System.out.println("Department: Computer Science");
        }
    }
}

public class MemberInnerClassDemo2
{
    public static void main(String[] args)
    {
        University u = new University();
        University.Department d = u.new Department();
        d.showDepartment();
    }
}
