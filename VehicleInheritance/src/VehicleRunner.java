
public class VehicleRunner
	{

		public static void main(String[] args)
			{
				Vehicle[] lot = new Vehicle[1];
				lot[0] = new Beetle();
				
				for(Vehicle v: lot)
					{
						v.type();
						v.make();
						v.model();
					}
 
			}

	}
