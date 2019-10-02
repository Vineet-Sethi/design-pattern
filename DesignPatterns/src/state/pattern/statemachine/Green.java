package state.pattern.statemachine;

public class Green implements TrafficLight
{
	public void displayTrafficSignal(TrafficContext ctxt) throws InterruptedException
	{
		System.out.println(TrafficSignal.GREEN.getSignal());
		for(int i = 0; i < 7; i++)
		{
			System.out.println(7-i);
			Thread.sleep(1000);
		}
		
		ctxt.setLight(new Yellow());
	}
}
