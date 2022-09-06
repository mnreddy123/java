package sep;

class Stack
{
  String st[];
	int top;
	int size;

	public  Stack(int size) 
	{
		st = new String[size];
		top = -1;
		this.size = size;
	}

	public  Stack() 
	{
		st = new String[10];
		top = -1;
		size = 10;
	}

	public boolean push(String value) 
	{
		if (isEmpty()) 
		{
			top += 1;
			st[top] = value;
			return true;
		}
		else 
		{
			if (!isFull()) 
			{
				top += 1;
				st[top] = value;
				return true;
			} 
			else 
			{
				System.out.println("stack is full.");
				return false;
			}
		}
	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {
			if (size > top) {
				return false;
			} else {
				return true;
			}
		}
	}

	public boolean isFull() 
	{
		if (top < size) 
		{
			return false;
		} 
		else 
		{
			return true;
		}
	}
	public String pop()
	{
			 if (isEmpty()) 
			 {
		            System.out.println("stack is empty.");
		            return null;
		     } 
			 else 
			 {
		            String value;
		            value = st[top];
		            top = top - 1;
		            return value;
			 }
		}
	
	public String peek()
	{
		if(top == -1)
		{
			System.out.println("stack is empty");
			return null;
		}
		else
		{
			return st[top];
		}
	}
}
public class MainClass
{
	public static void main(String[] args) 
	{
		 Stack s = new Stack();
		 System.out.println(s.push("nag"));
		 System.out.println(s.push("reddy"));
		 System.out.println(s.push("satish1"));
		 System.out.println(s.push("satish2"));
		 System.out.println(s.push("satish3"));
		 System.out.println(s.push("satish4"));
		 System.out.println(s.push("satish5"));
		 System.out.println(s.push("satish6"));
		 System.out.println(s.push("satish7"));
		 System.out.println(s.push("satish8"));
		 //System.out.println(s.push("satish9"));
		 System.out.println(s.pop());
		 System.out.println(s.peek());
		
	}
}


