package factory;

import java.util.Scanner;

public class EnemyShipTesting {

	public static void main(String[] args)
	{
		EnemyShipFactory shipFactory = new EnemyShipFactory();
		EnemyShip theEnemy = null;
		
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		System.out.print("What type of ship? (U / R / B)");
		
		if (userInput.hasNextLine())
		{
			String typeOfShip = userInput.nextLine();
			theEnemy = shipFactory.makeEnemyShip(typeOfShip);

			if(theEnemy != null)
			{
				doStuffEnemy(theEnemy);
			} 
			else
			{
				System.out.print("Please enter U, R, or B next time");
			} 
		}
	}
	
	public static void doStuffEnemy(EnemyShip anEnemyShip)
	{
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();
	}
}

/*

//EnemyShip ufoShip = new UFOEnemyShip();
doStuffEnemy(ufoShip);
System.out.print("\n");


//This allows me to make the program more dynamic. However it doesn't close the code from being modified which is bad!
EnemyShip theEnemy = null;

Scanner userInput = new Scanner(System.in);
System.out.print("What type of ship? (U or R)");

String enemyShipOption = "";

if (userInput.hasNextLine())
{
	enemyShipOption = userInput.nextLine();
}

if (enemyShipOption == "U")
{
	theEnemy = new UFOEnemyShip();
}
else if (enemyShipOption == "R")
{
	theEnemy = new RocketEnemyShip();
}
else
{
	theEnemy = new BigUFOEnemyShip();
}

doStuffEnemy(theEnemy);
*/