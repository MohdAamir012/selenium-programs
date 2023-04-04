package assignment_3;

public class Delay {

	public static void delay(int n) {
		try {
			Thread.sleep(n*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
