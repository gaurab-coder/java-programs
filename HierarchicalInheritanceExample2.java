class Employee
{
    void work()
    {
        System.out.println("Employee is working");
    }
}

class Manager extends Employee
{
    void manage()
    {
        System.out.println("Manager is managing the team");
    }
}

class Developer extends Employee
{
    void code()
    {
        System.out.println("Developer is writing code");
    }
}

public class HierarchicalInheritanceExample2
{
    public static void main(String[] args)
    {
        Manager m = new Manager();
        Developer d = new Developer();

        m.work();
        m.manage();

        d.work();
        d.code();
    }
}
