import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class DuplicateCounter 
{
	ArrayList<String> uniqueWords = new ArrayList<String>();
	ArrayList<Integer> count = new ArrayList<Integer>();
	public void count(File dataFile)
	{
		try {
			Scanner reader = new Scanner(dataFile);
			while(reader.hasNext())
			{
				boolean duplicate = false;
				String check = reader.next();
				for(int i = 0; i < uniqueWords.size(); i++)
				{
					if(check.equals(uniqueWords.get(i)))
					{
						duplicate = true;
						count.set(i, count.get(i) + 1);
					}
				}
				if(!duplicate)
				{
					uniqueWords.add(check);
					count.add(1);
				}
			}
			reader.close();
		}
		catch(IOException ex) {
			System.out.printf("ERROR: %s\n", ex);
			System.exit(0);
		}
	}
	public void write(File outputFile)
	{
		try {
			PrintWriter output = new PrintWriter(outputFile);
			for(int i = 0; i < uniqueWords.size(); i++)
			{
				output.println(uniqueWords.get(i) + ": " + count.get(i));
			}
			output.close();
		}
		catch(IOException ex)
		{
			System.out.printf("ERROR: %s\n", ex);
			System.exit(0);
		}
	}
}
