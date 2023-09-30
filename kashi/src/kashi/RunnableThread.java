package kashi;
class C implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("my chiled Thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class RunnableThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         
		C r  = new C();
	   Thread t = new Thread(r);
	   t.start();
	   for(int i=0;i<5;i++)
		{
			System.out.println("mac");
			Thread.sleep(1000);
		}

	}

}
