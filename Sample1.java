package aug25;

public class Sample1 extends Thread
{
  public void run()
  {
	  // by using getPriority() Method
	  System.out.println("running Thread name:" +Thread.currentThread().getName());
	  for(int i=1;i<5;i++)
	  {
		  try
		  {
			  Thread.sleep(500);
		  }
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
		  System.out.println(i);
	  }
  }
  public static void main(String[] args)
  {
	  Sample1 s2 = new Sample1();
	  Sample1 s3 = new Sample1();
	  Sample1 s4 = new Sample1();
	  s2.start();
	  // join(long milliseconds) Method
	  try
	  {
		  s2.join(1500);
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
	  s3.start();
	  s4.start();
  }
}
