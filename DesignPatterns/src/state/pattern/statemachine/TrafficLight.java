package state.pattern.statemachine;

public interface TrafficLight 
{
	void displayTrafficSignal(TrafficContext ctxt) throws InterruptedException;
}
