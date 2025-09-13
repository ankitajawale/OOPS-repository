package polymorphism;

class Aeroplane31
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

class CargoPlane31 extends Aeroplane31
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

class FighterPlane31 extends Aeroplane31
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
public class LaunchPolymorphism1 {
	
	

		public static void main(String[] args) 
		{
			Aeroplane31 cp=new CargoPlane31();//upcasting
			cp.landing();
			cp.takeoff();
			((CargoPlane31)cp).fly();
			//cp.fly();
			Aeroplane31 fp=new FighterPlane31();
			fp.takeoff();
			fp.landing();

		}


}
