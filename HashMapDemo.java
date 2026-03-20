import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class HashMapDemo
{
    public static void main(String[] args)
    {
        Map<Integer, String> hashmap= new HashMap<Integer, String>();
        System.out.println(hashmap.isEmpty());
        hashmap.put(1, "Gaurab");
        hashmap.put(2, "Suman");
        hashmap.put(3, "Mahesh");
        System.out.println(hashmap.size());
        hashmap.remove(2);
        System.out.println(hashmap);
        Set set=hashmap.entrySet();
        Iterator it=set.iterator();
        while(it.hasNext())
        {
            Map.Entry me=(Map.Entry)it.next();
            System.out.println(me.getKey()+" "+me.getValue());

        }
        System.out.println(hashmap.entrySet());
    }
}