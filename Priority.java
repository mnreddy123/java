package aug25;

public class Priority extends Thread 
{
     public void run()
     {
    	 System.out.println("priority of thread is:" + Thread.currentThread().getPriority());
     }
     public static void main(String[] args) 
     {
    	 Priority p1 = new Priority();
    	 Priority p2 = new Priority();
    	 Priority p3 = new Priority();
    	 // thread getNmae() Method
    	 System.out.println("name of p1:"+p1.getName());
    	 // thread getId() Method.
    	 System.out.println("id of p1:"+p1.getId());
    	 // thread priority() Method.
    	 p1.setPriority(Thread.MAX_PRIORITY);
    	 p2.setPriority(Thread.MIN_PRIORITY);
    	 p3.setPriority(Thread.NORM_PRIORITY);
    	 p1.start();
    	 p2.start();
    	 p3.start();
    	 
    	 
	 }
}
