import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
public class DuplicateRemover 
{
	ArrayList<String> uniqueWords = new ArrayList<String>();
	public void remove(File dataFile)
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
					}
				}
				if(!duplicate)
				{
					uniqueWords.add(check);
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
				output.print(uniqueWords.get(i) + " ");
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
