package pkg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Project5
{
	public static void main(String[] args) throws FileNotFoundException
	{

		int count = 0;

		Scanner in = new Scanner(new File("Countries4.csv")); // file scanner
		BinTree theTree = new BinTree();
		in.useDelimiter(",|\\n");
		for (int i = 0; i <= 155; i++)
		{
			
			if (i == 0)
			{
				in.nextLine();
				continue;
			} // end if statement
			Country newCountryy = new Country(in.next(), in.next(), in.next(), in.nextDouble(), in.nextDouble(), 
					in.nextDouble());

			theTree.insert(newCountryy.getcountryName(), (newCountryy.getcountryGDP() / newCountryy.getcountryPopulation()));
			count++;
			}

		in.close(); //close scanner
		in.close();
	}
}
