package factory;

public abstract class EnemyShip {
	
	private String name;
	private double amtDamage;
	
	public void displayEnemyShip()
	{
		System.out.println(getName() + " is on the screen");
	}

	public void followHeroShip()
	{
		System.out.println(getName() + " is following the hero");
	}
	
	public void enemyShipShoots() 
	{
		System.out.println(getName() + " attacks and does " + getDamage() + " damage to hero");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDamage() {
		return amtDamage;
	}

	public void setDamage(double amtDamage) {
		this.amtDamage = amtDamage;
	}
}