package builder;

public class Builder 
{
	public static void main(String[] args)
    {
        HouseBuilder builder = new IglooHouseBuilder();
        CivilEngineer engineer = new CivilEngineer(builder);

        engineer.constructHouse();
        House house = engineer.getHouse();

        System.out.println("Builder constructed: "+ house);
    }
}
