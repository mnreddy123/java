package aug25;

import java.util.HashMap;
import java.util.Set;

public class Qno_9 
{
	 public static void main(String[] args) 
	   {
		   HashMap<Integer,String> hs = new HashMap<Integer,String>();
		   hs.put(1, "nag");
		   hs.put(2, "reddy");
		   hs.put(3, "satish");
		   hs.put(4, "naik");
		   hs.put(5, "althaf");
		   
		   Set set = hs.entrySet();
		   System.out.println(set);
		   
		   // Qno_10 to get the value of a specified key in a map.
		   System.out.println();
		   System.out.println("Qno_10 To get the value of a specified key in a map.");
		   // here to get the value of 5 by using get() Method
		   String value = (String) hs.get(5);
		   System.out.println("Value for key 5 is:" + value);
		   
		   
		   // Qno_11 To get a set view of the keys contained in this map. 
		   System.out.println();
		   System.out.println("Qno_11 To get a set view of the keys contained in this map.");
		   // to get keyset in the present hashmap by using keySet() Method
		   Set key =  hs.keySet();
		   System.out.println("keyset is:"+key);
		   
		   
		   
		   // Qno_12 To get a collection view of the values contained in this map. 
           System.out.println();
           System.out.println("Qno_12 to get a collection view of the values contained in this map");
           System.out.println("collection view:"+hs.values());
	   }
}
