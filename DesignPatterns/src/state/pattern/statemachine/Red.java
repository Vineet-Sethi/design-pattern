package state.pattern.statemachine;

public class Red implements TrafficLight
{
	public void displayTrafficSignal(TrafficContext ctxt) throws InterruptedException
	{
		System.out.println(TrafficSignal.RED.getSignal());
		for(int i = 0; i < 5; i++)
		{
			System.out.println(5-i);
			Thread.sleep(1000);
		}
		
		ctxt.setLight(new Green());
	}
}
