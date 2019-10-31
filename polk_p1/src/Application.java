import java.io.*;
public class Application 
{
	public static void main(String[] args)
	{
		
		DuplicateRemover duplicateRemover = new DuplicateRemover();
		File dataFile = new File("problem1.txt");
		File outputFile = new File("unique_words.txt");
		duplicateRemover.remove(dataFile);
		duplicateRemover.write(outputFile);
		
		
	}
}
