package aug25;

import java.util.HashMap;
import java.util.Map;

public class Qno_8 
{
	 public static void main(String[] args) 
	   {
		   HashMap<Integer,String> hs = new HashMap<Integer,String>();
		   hs.put(1, "nag");
		   hs.put(2, "reddy");
		   hs.put(3, "satish");
		   hs.put(4, "naik");
		   hs.put(5, "althaf");
		   
		   for(Map.Entry m:hs.entrySet())
		   {
			   System.out.println(m.getKey()+" "+m.getValue());
		   }
		   
		   System.out.println("\nis value 'althaf' exist or not?");
		   if(hs.containsValue("althaf"))
		   {
			   System.out.println("yes:" );
		   }
		   else
		   {
			   System.out.println("no");
		   }
		   
		   System.out.println("\nis value 'ram' exist or not?");
		   if(hs.containsValue("ram"))
		   {
			   System.out.println("yes:" );
		   }
		   else
		   {
			   System.out.println("no");
		   }
		   
		   
			   
	   }


	}


