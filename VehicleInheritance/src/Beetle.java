
public class Beetle extends Car
	{
		public Beetle()
			{
				name = "Beetle";
				drive = "poor";
				
			}
	@Override
	public void make()
		{
			System.out.println("Make: " + name);
			System.out.println("Drives: " + drive);
			
		}

	@Override
	public void model()
		{
			System.out.println("Model: Final Edition SE");
			
		}
	
	

	}
