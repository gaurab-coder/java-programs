import java.util.ArrayList;
import java.util.List;
public class ListDemo
{
    public static void main(String[] args)
    {
        List<String> list=new ArrayList <String>();
        list.add("Anil");
        list.add("Gaurab");
        list.add("Sampanna");
        list.add("Surya");
        System.out.println("List of names: "+list);
        for(String name:list)
        {
            System.out.println(name);
        }
    }
}