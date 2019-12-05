
public class Audi extends Car
	{
		
		public Audi()
		{
			name = "Audi";
			drive = "smooth & sporty ";
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
			System.out.println("Model: 2003 Audi Le Mans Concept");
			
		}

	}
