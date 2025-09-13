package polymorphism;

class Aeroplane2
{
	public void takeoff()
	{
		System.out.println("aeropl taking off");
	}
	public void landing()
	{
		System.out.println("aeropl landing");
	}
	public void fly()
	{
		System.out.println("aeropl flying");

	}

}

class CargoPlane2 extends Aeroplane2
{
	public void takeoff()
	{
		System.out.println("cargoplane taking off needs long runway");
	}
	public void fly()
	{
		System.out.println("cargo flying");

	}

	public void landing()
	{
		System.out.println("cargo landing");
	}
}
class Airport
{
	public void permit(Aeroplane2 aeroplane)
	{
		aeroplane.takeoff();
		aeroplane.fly();
		aeroplane.landing();
	}

}

class FighterPlane2 extends Aeroplane2
{
	public void takeoff()
	{
		System.out.println("fighterpalne taking off needs small runway");
	}
	public void fly()
	{
		System.out.println("fighter flying");

	}
	
	public void landing()
	{
		System.out.println("fighterplane landing");
	}
	
}

public class LaunchPloy2 {

	public static void main(String[] args) 
	{
		CargoPlane2 cp=new CargoPlane2();
		FighterPlane2 fp=new FighterPlane2();
		
		Airport a=new Airport();
		a.permit(fp);
		a.permit(cp);
		
		
	}

}
