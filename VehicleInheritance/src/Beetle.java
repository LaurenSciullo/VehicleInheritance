
public class Beetle extends Car
	{

	@Override
	public void make()
		{
			System.out.println("I don't know what the make of Beetles are.");
			
		}

	@Override
	public void model()
		{
			System.out.println("Ya I don't know a model either.");
			
		}
	
	public Beetle()
	{
		name = "Beetle";
		drive = "poor";
	}

	}
