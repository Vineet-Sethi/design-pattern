package state.pattern.basic;

public enum TrafficSignal 
{
	RED("Red Light ON. Traffic halted!"), 
	GREEN("Green Light ON. Traffic allowed to pass!"), 
	YELLOW("Yellow Light ON. Traffic halting slowly!");
	
	private String signal;
	
	TrafficSignal(String signal)
	{
		this.signal = signal;
	}

	public String getSignal() 
	{
		return signal;
	}
}
