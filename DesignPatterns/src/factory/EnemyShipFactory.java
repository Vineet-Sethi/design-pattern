package factory;

//The factory encapsulates ship creation, By encapsulating we only have one place to make modifications
public class EnemyShipFactory{
	
	public EnemyShip makeEnemyShip(String newShipType){
		
		EnemyShip newShip = null;
		
		if (newShipType.equals("U"))
		{
			newShip = new UFOEnemyShip();
		} 
		else if (newShipType.equals("R"))
		{
			newShip = new RocketEnemyShip();
		} 
		else if (newShipType.equals("B"))
		{
			newShip = new BigUFOEnemyShip();
		} 
		
		return newShip;
	}
}