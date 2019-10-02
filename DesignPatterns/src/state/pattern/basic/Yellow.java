package state.pattern.basic;

public class Yellow implements TrafficLight
{
	public void displayTrafficSignal() throws InterruptedException
	{
		System.out.println(TrafficSignal.YELLOW.getSignal());
		for(int i = 0; i < 3; i++)
		{
			System.out.println(3-i);
			Thread.sleep(1000);
		}
	}
}
