
public class WorkerBus extends Bus
	{
		
		public WorkerBus()
		{
			name = "That white Worker Bus you see all the time";
			drive = "Not well, but gets the job done";
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
			System.out.println("Model: Mr.Steal Your Grass 600");
			
		}

	}
