package aug24;
import java.util.*;
public class Stack1 
{
  public static void main(String[] args) 
  {
	 Stack<String> st = new Stack<String>();
	 
	 //checking stack is empty or not using empty() method
	 
	 boolean result = st.empty();
	 System.out.println("the stack is empty:" +result);
	 
	 // pushing the elements by using push() method
	 st.push("nag");
	 st.push("reddy");
	 st.push("satish");
	 st.push("naik");
	 st.push("althaf");
	 //removing the element by using pop() method 
	 st.pop();
	 
	 Iterator<String> itr = st.iterator();
	 while(itr.hasNext())
	 {
		 System.out.println(itr.next());
		 
	 }
	 
	// checking stack is empty or not
     result = st.empty();
	 System.out.println("the stack is empty:" +result);
	 
	 // Access element from the top of the stack
	 
	 //String stk = st.peek();
	 //System.out.println(stk);
	           //(or)
	 System.out.println("element at top:"+st.peek());
	 
	 
	 // search an element by using search() Method
	 int loc = st.search("nag");
	 System.out.println("location of nag:"+loc);
	 
	 // to find size
	 System.out.println(st.size());
  }
}
