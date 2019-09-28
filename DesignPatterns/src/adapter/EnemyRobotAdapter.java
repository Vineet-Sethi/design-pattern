package adapter;

import adapter.EnemyAttacker;
import adapter.EnemyRobot;

public class EnemyRobotAdapter implements EnemyAttacker {

	private EnemyRobot theRobot;
	
	public EnemyRobotAdapter(EnemyRobot newRobot) {
		 theRobot = newRobot;
	}
	
	@Override
	public void assignDriver(String driveName) {
		theRobot.reactToHuman(driveName);
	}

	@Override
	public void driveForward() {
		theRobot.walkForward();

	}

	@Override
	public void fireWeapon() {
		theRobot.smashWithHand();
	}

}
