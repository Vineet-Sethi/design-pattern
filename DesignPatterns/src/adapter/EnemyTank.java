package adapter;

public class EnemyTank implements EnemyAttacker{

	@Override
	public void assignDriver(String driverName) {
		System.out.println("Enemy Tank driven by:" + driverName);
		
	}

	@Override
	public void driveForward() {
		System.out.println("Enemy Tank moves 5 spaces");
		
	}

	@Override
	public void fireWeapon() {
		System.out.println("Enemy Tank causes level 5 damage");
		
	}

}
