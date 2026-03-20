import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class SetDemo
{
    public static void main(String[] aer)
    {
       Set set=new HashSet();
       set.add("Gaurab");
        set.add("Suman");
         set.add("Mahesh");
         set.add("Prakash");
         set.add("Chet");
         set.add("Akhil");
         System.out.println(set);
        //  System.out.println(set);
         System.out.println();
         for(int i=0;i<set.size();i++)
         {
            System.out.println(set);
         }
         System.out.println();
         Set sortedset=new TreeSet(set);
         Iterator itr=sortedset.iterator();
         while(itr.hasNext())
            System.out.println(itr.next());


    }
}