package aug25;

public class Sample extends Thread 
{
    public void run()
    {
    	// by using run() & start() & sleep() & join() Method
    	System.out.println("hello hi");
    	for(int i=1;i<5;i++)
    	{
    		try
    		{
    			Thread.sleep(600);
    		}
    		catch(InterruptedException e)
    		{
    			System.out.println(e);
    		}
    		System.out.println(i);
    	}
    }
    public static void main(String[] args) 
    {
	   Sample s1 = new Sample();
	   Sample s2 = new Sample();
	   s1.start();
	   
	   // Starts second thread when first thread s1 is died.
	   // by using join () Method.
	   try
	   {
	     s1.join();
	   }
	   catch(Exception e)
	   {
		   System.out.println(e);
	   }
	   
	   s2.start();
	}
 
}
