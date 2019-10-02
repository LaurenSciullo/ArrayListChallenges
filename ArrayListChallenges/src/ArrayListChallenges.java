import java.util.ArrayList;
import java.util.Collections;

public class ArrayListChallenges
	{
static ArrayList < String > farm;
		public static void main(String[] args)
			{
				fillArray();
				printList();
				
				alphabeticallySorted();
				printList();
				
				firstAndLast();
				
				mostCommonLetterRemove();
				printList();
				
				mostLetters();
				fewestLetters();
				
			}
		
		public static void fillArray()
		{
				farm = new ArrayList< String >();
				
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
				
		}
		
		public static void printList()
		{
				
				for (String s: farm)
					{
						System.out.println(s);
					}
		}
		
		public static void alphabeticallySorted()
		{
				Collections.sort(farm);
				
				System.out.println("\nYour alphabetically sorted farm: " );
				
		}
		
		public static void firstAndLast()
		{
				
				System.out.println("\nYour first and last words, alphabetically:");
				System.out.println(farm.get(0) + ", " + (farm.get(9)));
				
		}
		
		public static void mostCommonLetterRemove()
		{
				
				System.out.println("\nYour list without strings that start with the most common letter:");
				for (int i = farm.size()-1; i >= 0; i--)
					{
						String currentLetter = farm.get(0).substring(0, 1);
						
						if (farm.get(i).substring(0, 1).equals(currentLetter))
							{
								farm.remove(i);	
							}
				
					}
			
			}
		
		public static void mostLetters()
		{
			System.out.println("\nYour name with the most letters: ");
			int index = 0;
			int max = farm.get(0).length();
			for (int p = 0; p < farm.size() ; p++)
				{
				
			if (farm.get(p).length() > max )
				{
					max = farm.get(p).length();
					index = p;
				}
				}
			System.out.println(farm.get(index));
		}
		
		public static void fewestLetters()
		{
			
			System.out.println("\nYour name with the fewest letters: ");
			int index = 0;
			int max = farm.get(0).length();
			for (int i = 0; i < farm.size(); i++)
				{
					if(farm.get(i).length() < max)
						{
							max = farm.get(i).length();
							index = i;
						}
				}
			System.out.println(farm.get(index));
		}

	}
