package polymorphism;


class Aeroplane
{
	public void run()
	{
		System.out.println("aero running");
	}
	
	public void fly()
	{
		System.out.println("aero flying");
	}


}

class Cargoplane extends Aeroplane
{
	public void run()
	{
		System.out.println("Cargo running");
	}
	
	public void fly()
	{
		System.out.println("Cargo flying");
	}


}

class Airport2
{
	public void permit(Aeroplane aeroplane)
			{
		aeroplane.run();
		aeroplane.fly();
			}

}

public class polypractice {

	public static void main(String[] args) {
		
		Cargoplane cp=new Cargoplane();
		Airport2 A =new Airport2();
		A.permit(cp);

	}

}
