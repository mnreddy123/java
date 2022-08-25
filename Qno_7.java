package aug25;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Qno_7 
{
   public static void main(String[] args) 
   {
	   HashMap<Integer,String> hs = new HashMap<Integer,String>();
	   hs.put(1, "nag");
	   hs.put(2, "reddy");
	   hs.put(3, "satish");
	   hs.put(4, "naik");
	   hs.put(5, "althaf");
//	   Iterator it = hs.entrySet().iterator();
//	   while(iterator.hasNext())
//	   {
//		   System.out.println(it.next());
//	   }
	   
	   for(Map.Entry m:hs.entrySet())
	   {
		   System.out.println(m.getKey()+" "+m.getValue());
	   }
	   
	   System.out.println("\nis key '4' exist or not?");
	   if(hs.containsKey(4))
	   {
		   System.out.println("yes:" + hs.get(4));
	   }
	   else
	   {
		   System.out.println("no");
	   }
	   
	   System.out.println("\nis key '8' exist or not?");
	   if(hs.containsKey(8))
	   {
		   System.out.println("yes:" + hs.get(8));
	   }
	   else
	   {
		   System.out.println("no");
	   }
	   
	   
		   
   }


}

