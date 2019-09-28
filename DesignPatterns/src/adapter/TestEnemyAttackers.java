package adapter;

import adapter.EnemyRobot;
import adapter.EnemyTank;

public class TestEnemyAttackers {

	public static void main(String[] args) {
		
		EnemyTank newTank = new EnemyTank();
		newTank.assignDriver("XXX");
		newTank.driveForward();
		newTank.fireWeapon();
		
		EnemyRobot newRobot = new EnemyRobot();
		newRobot.reactToHuman("XXX");
		newRobot.walkForward();
		newRobot.smashWithHand();
		
		EnemyRobotAdapter roboAdapter = new EnemyRobotAdapter(newRobot);
		roboAdapter.assignDriver("XXX");
		roboAdapter.driveForward();
		roboAdapter.fireWeapon();
		


	}

}
