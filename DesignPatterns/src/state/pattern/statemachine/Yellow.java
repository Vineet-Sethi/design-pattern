package state.pattern.statemachine;

public class Yellow implements TrafficLight
{
	public synchronized void displayTrafficSignal(TrafficContext ctxt) throws InterruptedException
	{
		System.out.println(TrafficSignal.YELLOW.getSignal());
		for(int i = 0; i < 3; i++)
		{
			System.out.println(3-i);
			Thread.sleep(1000);
		}
		
		System.err.println("==============================");
		ctxt.setLight(new Red());
	}
}
