import java.io.*;
public class Application 
{
	public static void main(String[] args)
	{
		
		DuplicateCounter duplicateCounter = new DuplicateCounter();
		File dataFile = new File("problem2.txt");
		File outputFile = new File("unique_word_counts.txt");
		duplicateCounter.count(dataFile);
		duplicateCounter.write(outputFile);
		
		
	}
}
