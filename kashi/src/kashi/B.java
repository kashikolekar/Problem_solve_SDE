package kashi;
class A extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("kashi");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class B {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		A t = new A();
		t.start(); 
		for(int i=0;i<5;i++)
		{
			System.out.println("mac");
			Thread.sleep(1000);
		}

	}

}
