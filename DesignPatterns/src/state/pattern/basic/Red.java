package state.pattern.basic;

public class Red implements TrafficLight
{
	public void displayTrafficSignal() throws InterruptedException
	{
		System.out.println(TrafficSignal.RED.getSignal());
		for(int i = 0; i < 5; i++)
		{
			System.out.println(5-i);
			Thread.sleep(1000);
		}
	}
}
