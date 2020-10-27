package shinesoft;

public class MetaInfo 
{
	public static void main(String[] args) {
		Thread t1 = new Thread()
		   {
			 public void run()
			 {
				 System.out.println(currentThread());
				 
				 
			 }
		   };
		   Thread t2 = new Thread()
		   {
			 public void run()
			 {
				 System.out.println(currentThread());
			 }
		   };
		   Thread t3 = new Thread()
		   {
			 public void run()
			 {
				 System.out.println(currentThread());
			 }
		   };
		   System.out.println(t1.getName());
		   System.out.println(t1.getPriority());
		   System.out.println(t2.getName());
		   System.out.println(t2.getPriority());
		   System.out.println(t3.getName());
		   System.out.println(t3.getPriority());
		   t1.setName("One");
		   t1.setPriority(9);
		   t2.setName("Two");
		   t2.setPriority(Thread.MAX_PRIORITY);
		   t3.setName("Three");
		   t3.setPriority(Thread.MIN_PRIORITY);
		   t1.start();
		   t2.start();
		   t3.start();
	}

}
