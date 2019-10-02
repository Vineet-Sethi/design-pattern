package state.pattern.statemachine;

public class TrafficStateController 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
	    //Basic state pattern
		/*TrafficContext ctxt = new TrafficContext();
		ctxt.signalTraffic();
		ctxt.setLight(new Green());
		ctxt.signalTraffic();
		ctxt.setLight(new Yellow());
		ctxt.signalTraffic();*/
		
		TrafficContext ctxt = new TrafficContext();
		while(true)
		{
			ctxt.signalTraffic();
		}
		
	}
}
