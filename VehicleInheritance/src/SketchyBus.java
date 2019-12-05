
public class SketchyBus extends Bus
	{
		
		public SketchyBus()
			{
				name = "Sketchy Bus";
				drive = "bumpy";
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
			System.out.println("Model: candyGiver 2000");
			
		}
	

	

	}
