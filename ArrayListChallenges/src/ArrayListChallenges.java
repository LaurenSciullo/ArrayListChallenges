import java.util.ArrayList;
import java.util.Collections;

public class ArrayListChallenges
	{

		public static void main(String[] args)
			{
				ArrayList < String > farm = new ArrayList< String >();
				
				farm.add("Sheep");
				farm.add("Pigs");
				farm.add("Cows");
				farm.add("Chickens");
				farm.add("Horses");
				farm.add("Goats");
				farm.add("Ducks");
				farm.add("Mice");
				farm.add("Hounds");
				farm.add("Snakes");
				
				System.out.println("Your farm: ");
				for (String s: farm)
					{
						System.out.println(s);
					}
				
				Collections.sort(farm);
				
				System.out.println("\nYour alphabetically sorted farm: " );
				for (String sort : farm)
					{
						System.out.println(sort);
					}
				
				System.out.println("\nYour first and last words, alphabetically:");
				System.out.println(farm.get(0) + ", " + (farm.get(9)));
				
				
				for (int i = farm.size()-1; i >= 0; i--)
					{
						String currentLetter = farm.get(0);
						
						if (farm.get(i) == currentLetter)
							{
								farm.remove(currentLetter);
							}
						System.out.println(farm);
					
					}
			
				

			}

	}
