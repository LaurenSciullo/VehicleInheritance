
public class VehicleRunner
	{

		public static void main(String[] args)
			{
				Vehicle[] lot = new Vehicle[8];
				lot[0] = new Beetle();
				lot[1] = new SketchyBus();
				lot[2] = new Audi();
				lot[3] = new Greyhound();
				lot[4] = new Mercedes();
				lot[5] = new BMW();
				lot[6] = new Tesla();
				lot[7] = new WorkerBus();
				
				for(Vehicle v: lot)
					{
						v.type();
						v.make();
						v.model();
						
						System.out.println();
					}
 
			}

	}
