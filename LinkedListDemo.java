import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListDemo
{
    public static void main(String[] jofi)
    {
        LinkedList linkedlist=new LinkedList();
        linkedlist.add(102);
        linkedlist.add(100);
        linkedlist.add(101);        
        linkedlist.add(106);
        linkedlist.add(109);
        System.out.println("LinkedList: "+linkedlist);
        Iterator iterator=linkedlist.iterator();
        System.out.println("LinkedList using Iterator: ");
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}