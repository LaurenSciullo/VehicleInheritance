
public class Mercedes extends Car
	{
		
		public Mercedes()
		{
			name = "Mercedes-Benz";
			drive = "steady & sturdy";
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
			System.out.println("Model: AMG GT 63 4MATIC Hatchback");
			
		}

	}
