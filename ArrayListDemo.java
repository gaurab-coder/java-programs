import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class ArrayListDemo
{
    public static void main(String djf[])
    {
        ArrayList<String> arraylist=new ArrayList<String>();
        System.out.println("Array size is "+arraylist.size());
        arraylist.add("Gaurab");
        arraylist.add("Suman");
        arraylist.add("Dipesh");
        arraylist.add("Ram");
        System.out.println("Array size is "+arraylist.size());
        // Collections.sort(arraylist);
        Collections.sort(arraylist);
        System.out.println(arraylist);
        Iterator it=arraylist.iterator();
        while(it.hasNext()) {
        System.out.println(it.next());
        }
        // System.out.println(it.next());
        System.out.println("after while loop");
        for(int i=0;i<arraylist.size();i++)
        {
            System.out.println(arraylist.get(i));
        }

    }
}
