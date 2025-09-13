package polymorphism;


class Animal
{
	public void eat()
	{
		System.out.println("Animal is eating"); 
	}
	public void running()
	{
		System.out.println("Animal is running"); 
	}
}

class Tiger extends Animal
{
	public void eat()
	{
		System.out.println("Tiger hunts and eating"); 
	}
	public void running()
	{
		System.out.println("Tiger is running"); 
	}
}
class Monkey extends Animal
{
	public void eat()
	{
		System.out.println("Monkey steals and eating"); 
	}
	public void running()
	{
		System.out.println("Monkey is running after stealing"); 
	}

}
class Forest
{
	public void permit(Animal animal)
	{
		animal.eat();
		animal.running();
	}

}
public class LaunchPoly3 
{

	public static void main(String[] args) 
	{
			Tiger T=new Tiger();
			Monkey M=new Monkey();
			
			Forest F= new Forest();
			F.permit(M);
			F.permit(T);
	}

}
