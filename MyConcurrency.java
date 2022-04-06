package sumArray;

class Concurrency extends Thread{

	@Override
	public void run() {
		
		int[] randomNumber = new int [200000000];
		int sum=0;
		for (int i = 0; i < 10; i++)
		{
			randomNumber[i]= (int) (Math.random()*200000000);
		}
		for (int i = 0; i < 10; i++)
		{
	         System.out.println( Thread.currentThread().getId() + " Value " + randomNumber[i]);         
	    }
		
		for (int i = 0; i < 10; i++)
		{	
			sum=sum+randomNumber[i];
		
	}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	}
	


public class MyConcurrency {

	public static void main(String[] args) {
		Concurrency thread1 = new Concurrency();
		thread1.start();
		Concurrency thread2 = new Concurrency();
		thread2.start();
		
	}

}
	