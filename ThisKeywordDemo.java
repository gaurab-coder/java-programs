 class StudentDemo
{
    int id;
    String address;
    int age;
    public StudentDemo(int id, String address, int age)
    {
        this.id=id;
        this.address=address;
        this.age=age;
    }
    void display()
    {
        System.out.println("Id:"+id+"\t Address:"+address+"\t Age:"+age);
    }

}
public class ThisKeywordDemo
{
    public static void main(String ajrhieuy[])
        {
            StudentDemo input=new StudentDemo(1000,"Bhaktapur",21);
            StudentDemo input1=new StudentDemo(1001,"Kathmandu",22);
            StudentDemo input2=new StudentDemo(1002,"Lalitpur",20);
            input.display();
            input1.display();
            input2.display();
            
        
        }
}