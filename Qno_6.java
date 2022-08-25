package aug25;

import java.util.HashMap;
import java.util.Iterator;

public class Qno_6 
{
   public static void main(String[] args) 
   {
	   HashMap<Integer,String> hs = new HashMap<Integer,String>();
	   hs.put(1, "nag");
	   hs.put(2, "reddy");
	   hs.put(3, "satish");
	   hs.put(4, "naik");
	   hs.put(5, "althaf");
	   System.out.println("current map:"+hs);
	   HashMap<Integer,String> hs1 = new HashMap<Integer,String>();
	   // copy the map by using clone() Method
	   hs1 = (HashMap) hs.clone();
	   System.out.println("clone map:"+hs1);
	   
//	   Iterator itr = hs.entrySet().iterator();
//	   while(itr.hasNext())
//	   {
//		   System.out.println(itr.next());
//		   
//	   }
   }
}
