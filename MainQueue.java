package sep;

class Queue 
{
   int front ,rear;
   int size;
   //String arr[];
   String Queue[] = new String[5];
   // adding data
   public void enQueue(String data)
   {
	   Queue[rear] = data;
	   rear = rear+1;
	   size = size+1;
   }
   // deleting data
   public String deQueue()
   {
	   String data = Queue[front];
	   front = front+1;
	   size = size-1;
	   return data;
   }
   public void show()
   {
	   System.out.print("Elements: ");
	   for(int i=0;i<size;i++)
	   {
		   System.out.print(Queue[front+i] + " ");
	   }
   }
}
   
   
public class MainQueue
{
	public static void main(String[] args) 
	{
		Queue q = new Queue();
		q.enQueue("reddy");
		q.enQueue("ram");
		q.enQueue("satish");
		q.enQueue("prasad");
		q.enQueue("60");
		q.deQueue();
		//q.enQueue(44); out of bounds
		q.show();
		
	}
}
