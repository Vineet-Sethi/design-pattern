package state.pattern.statemachine;

public class TrafficContext 
{
	private TrafficLight light;

	public TrafficContext() 
	{
		this.light = new Red();
	}

	public void setLight(TrafficLight light) 
	{
		this.light = light;
	}
	
	public void signalTraffic() throws InterruptedException
	{
		this.light.displayTrafficSignal(this);
	}
	
}
