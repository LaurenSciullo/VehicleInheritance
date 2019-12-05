
public class Tesla extends Car
	{
		
		public Tesla()
		{
			name = "Tesla";
			drive = "amazing & eco-efficient";
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
			System.out.println("Model: Cybertruck");
			
		}

	}
