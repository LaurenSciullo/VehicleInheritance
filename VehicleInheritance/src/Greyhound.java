
public class Greyhound extends Bus
	{
		
		public Greyhound()
		{
			name = "Greyhound";
			drive = "largely";
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
			System.out.println("Model: oneWayTicketToNowhere");
			
		}

	}
