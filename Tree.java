package aug25;
import java.util.*;
import java.util.Iterator;
import java.util.TreeMap;

public class Tree 
{
   public static void main(String[] args) 
   {
	 TreeMap<Integer,String> tr = new TreeMap<Integer,String>();
	 tr.put(1, "reddy");
	 tr.put(3, "nag");
	 tr.put(4, "begum");
	 tr.put(2, "althaf");
	 tr.put(5, "satish");
   //	 System.out.println(tr);
	 for(Map.Entry map:tr.entrySet())
	 {
		 System.out.println(map.getKey()+"--> " +map.getValue());
	 }
	 
	 // To copy a Tree Map content to another Tree Map by using putAll() Mthod.
	 System.out.println();
     System.out.println("Qno_2 to copy a Tree Map content to another Tree Map");
	 TreeMap<Integer,String> tr1 = new TreeMap<Integer,String>();
	 SortedMap < Integer, String > sp = new TreeMap < Integer, String > ();
	 tr1.put(81, "reddy");
	 tr1.put(30, "nag");
	 tr1.put(40, "begum");
	 tr1.putAll(tr);
	 for(Map.Entry map:tr1.entrySet())
	 {
		 System.out.println(map.getKey()+"--> " +map.getValue());
	 }
	 
	 
	 //   To search a key in a Tree Map by using containskey() Method.
	 System.out.println();
	 System.out.println("Qno_3 To search a key in a Tree Map:");
	 if(tr1.containsKey(30))
	 {
		 System.out.println("treemap contains key :30");
	 }
	 else
	 {
		 System.out.println("treemap does not contains key 30"); 
	 }
	 if(tr1.containsKey(90))
	 {
		 System.out.println("treemap contains key :90");
	 }
	 else
	 {
		 System.out.println("treemap does not contains key: 90"); 
	 }
	 
	 // Write a Java program to search a value in a Tree Map by using containsValue() Method.
	 
	 System.out.println();
	 System.out.println("Qno_4 To search a value in a Tree Map:");
	 if(tr1.containsValue("hari"))
	 {
		 System.out.println("treemap contains value hari");
	 }
	 else
	 {
		 System.out.println("treemap does not contains value hari"); 
	 }
	 if(tr1.containsValue("begum"))
	 {
		 System.out.println("treemap contains value begum");
	 }
	 else
	 {
		 System.out.println("treemap does not contains value begum"); 
	 }
	 
	   // To get all keys from the given a Tree Map. 
	 
	 System.out.println();
	 System.out.println("Qno_5 To get all keys from the given a Tree Map. ");
	 //System.out.println("key set of tr1:"+tr1.keySet()); // (or)
	 
	 Set<Integer> st = tr1.keySet();
	 for(Integer in:st)
	 {
		 System.out.println(in);
	 }
	 
	 // To delete all elements from a given Tree Map.
	 System.out.println();
	 System.out.println("Qno_6 To delete all elements from a given Tree Map.");

	 TreeMap<Integer,String> tree = new TreeMap<Integer,String>();
	 tree.put(1, "reddy");
	 tree.put(3, "nag");
	 tree.put(4, "begum");
	 tree.put(2, "althaf");
	 tree.put(5, "satish");

	System.out.println("treemap is:"+tree);
	//To delete all elements from a given Tree Map by using clear() Method.
	tree.clear();
	System.out.println("after deleting all elements from a tree:"+tree);
	
	//Write a Java program to sort keys in Tree Map by using comparator. 
    System.out.println();
    System.out.println("Qno_7 To sort keys in Tree Map by using comparator. ");
    System.out.println(tr);
    class sort_key implements Comparator<Integer>
    {
        @Override
       public int compare(Integer ir1, Integer ir2) 
        {
           return ir1.compareTo(ir2);
        }
   }
    
    
    //To get a key-value mapping associated with the greatest key and the least key in a map. 
     System.out.println();
     System.out.println("Qno_8 To get a key-value mapping associated with the greatest key and the least key in a map");
     
     System.out.println("greatest_key:"+tr1.firstEntry());
     System.out.println("least_key:"+tr1.lastEntry());
     
     // to get the first (lowest) key and the last (highest) key currently in a map.
     System.out.println();
     System.out.println("Qno_9 To get the first (lowest) key and the last (highest) key currently in a map");
     System.out.println("lowest key:"+tr1.firstKey());
     System.out.println("highest key:"+tr1.lastKey());
     
     // To get a reverse order view of the keys contained in a given map. 
     System.out.println();
     System.out.println("Qno_10. To get a reverse order view of the keys contained in a given map");
     System.out.println("Reverse order view of keys:" +tr1.descendingKeySet());
     
     
     //Qno_11
     System.out.println();
     System.out.println("Qno_11 To get a key-value mapping associated with the greatest key less than or equal to the given key.");
     System.out.println("Checking the entry for 10: ");
     System.out.println("Value is: " + tr1.floorEntry(10));
     System.out.println("Checking the entry for 80: ");
     System.out.println("Value is: " + tr1.floorEntry(80));
     
     
     //Qno_12
     System.out.println();
     System.out.println("Qno_12 To get the greatest key less than or equal to the given key");
     System.out.println("Checking the entry for 10: ");
     System.out.println("Key is: " +tr1.floorKey(10));
     System.out.println("Checking the entry for 90: ");
     System.out.println("Key is: " + tr1.floorKey(90));
     
     
     //Qno_13
     System.out.println();
     System.out.println("Qno_13  To get the portion of a map whose keys are strictly less than a given key.");
     System.out.println("Checking the entry for 10: ");
     System.out.println("Key(s): " + tr1.headMap(10));
     System.out.println("Checking the entry for 2: ");
     System.out.println("Key(s): " + tr1.headMap(2));

     // Qno_14
     System.out.println();
     System.out.println("Qno_14  to get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key");
     System.out.println("Checking the entry for 40: ");
     System.out.println("Key(s): " + tr1.headMap(40));
     
     
     // Qno_15
     System.out.println();
     System.out.println("Qno_15  To get the least key strictly greater than the given key. Return null if there is no such key");
     System.out.println("Checking the entry for 10: ");
     System.out.println("Key(s): "+tr1.higherEntry(10)); 
     System.out.println("Checking the entry for 30: ");
     System.out.println("Key(s): "+tr1.higherEntry(30));
     
     // Qno_16
     System.out.println();
     System.out.println("Qno_16 To get a key-value mapping associated with the greatest key strictly less than the given key. Return null if there is no such key");
     System.out.println("Checking the entry for 10: ");
     System.out.println("Key(s): " + tr1.lowerKey(10));
     System.out.println("Checking the entry for 40: ");
     System.out.println("Key(s): " + tr1.lowerKey(40));
     
     
     //Qno_17
     System.out.println();
     System.out.println("Qno_17 To get the greatest key strictly less than the given key. Return null if there is no such key");
     System.out.println("Checking the entry for 80: ");
     System.out.println("Key(s): " + tr1.lowerKey(80));
     System.out.println("Checking the entry for 1: ");
     System.out.println("Key(s): " + tr1.lowerKey(1));
     
     
     //Qno_18
     System.out.println();
     System.out.println("Qno_18 To get NavigableSet view of the keys contained in a map");
     System.out.println("Orginal TreeMap content: " + tr1);
     System.out.println("navigableKeySet content: " + tr1.navigableKeySet());

     
     //Qno_19
     System.out.println();
     System.out.println("Qno_19 To remove and get a key-value mapping associated with the least key in a map.");
     System.out.println("Value before poll: " + tr1);
     System.out.println("Value returned: " + tr1.pollFirstEntry());
     System.out.println("Value after poll: " + tr1);
     
     
     //Qno_20
     System.out.println();
     System.out.println("Qno_20  To remove and get a key-value mapping associated with the greatest key in this map");
     System.out.println("Value before poll: " + tr1);
     System.out.println("Value returned: " + tr1.pollLastEntry());
     System.out.println("Value after poll: " + tr1);
     
     //Qno_21
     System.out.println();
     System.out.println("Qno_22  To get the portion of a map whose keys range from a given key (inclusive), to another key (exclusive)");
     System.out.println("Orginal TreeMap content: " + tr1);
     sp = tr1.subMap(4, 30);
     System.out.println("Sub map key-values: " + sp);
     
     
     

}
}
