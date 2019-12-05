
public class BMW extends Car
	{
		
		public BMW()
		{
			name = "BMW";
			drive = "European";
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
			System.out.println("Model: BMW X7");
			
		}

	}
