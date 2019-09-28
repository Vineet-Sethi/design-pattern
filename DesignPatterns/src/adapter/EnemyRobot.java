package adapter;

public class EnemyRobot {
	
	public void reactToHuman(String driverName){
		System.out.println("Enemy Robot snubs:" + driverName);
	}
	
	public void walkForward(){
		System.out.println("Enemy moves 5 steps:");
	}

	public void smashWithHand(){
		System.out.println("Enemy Robot damages like the hulk");
	}
}
