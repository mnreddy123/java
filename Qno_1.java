package aug25;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class Qno_1 
{
   public static void main(String[] args)
   {
	   HashMap<Integer,String> map = new HashMap<Integer,String>();
	   map.put(2, "nag");
	   map.put(3, "reddy");
	   map.put(5, "satish");
	   map.put(6, "naik");
	   map.put(1, "althaf");
	   
	   //System.out.println(map);
	    // iterating hashmap
	   
	   System.out.println("iterate hashmap:");
	   System.out.println();
	   for(Map.Entry m : map.entrySet())
	   {
		   System.out.println(m.getKey()+" "+m.getValue());
	   }
	   // 2. to find hashmap size by using size() method
	   
	   System.out.println("\nsize of the hash map:" + map.size());
	   
	   // 3. to copy all of the mappings from the specified map to another map using putAll() method.
	   
	   System.out.println();
	   HashMap<Integer,String> map1 = new HashMap<Integer,String>();
	   map1.put(7, "prasad");
	   map1.put(8, "bindhu");
	   map1.putAll(map);
	   System.out.println("After invoking putAll() Method:");
	  
	   for(Map.Entry m:map1.entrySet())
	   {
		   System.out.println(m.getKey()+" "+m.getValue());
	   }
	   
	   
	   //Qno_4  Write a Java program to remove all of the mappings from a map. 
	   
       System.out.println("\nQno_4 Sremove all of the mappings from a map:");   
	   HashMap<Integer,String> mp = new HashMap<Integer,String>();
	   mp.put(1, "nag");
	   mp.put(2, "reddy");
	   mp.put(3, "satish");
	   mp.put(4, "naik");
	   mp.put(5, "althaf");
	   System.out.println("present hashmap:"+mp);
	   
	   // remove all of mappings from map by using clear() Method
	   mp.clear();
	   System.out.println("After clear the map:"+mp);
	   
	   
	   // Qno_5 check whether a map contains key-value mappings (empty) or not. 
	   System.out.println("\nQno_5 check whether a map contains key-value mappings (empty) or not:");
	   HashMap<Integer,String> hs = new HashMap<Integer,String>();
	   hs.put(1, "nag");
	   hs.put(2, "reddy");
	   hs.put(3, "satish");
	   hs.put(4, "naik");
	   hs.put(5, "althaf");
	   System.out.println("current map:" + hs);
	   // to check map is empty or not using isEmpty() Method
	   boolean result = hs.isEmpty();
	   System.out.println("the map is empty:"+result);
	   // clear map using clear method
	   hs.clear();
	   result = hs.isEmpty();
	   System.out.println("the map is empty:"+result);
    }
}
