package assignment4;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class Dictionary 
{
	protected ArrayList<String> dictionary;
	public Dictionary()
	{
		dictionary = new ArrayList<String>();
		createDictionary();
	}
	public void createDictionary()
	{
		try 
		{
			FileReader freader = new FileReader("A4-words.txt"); //reads the text file and ignores lines with *, only takes first five characters
			BufferedReader reader = new BufferedReader(freader);
			
			for (String s = reader.readLine(); s != null; s = reader.readLine()) 
			{
				if(!(s.startsWith("*")))
					dictionary.add((s.substring(0,5)));
				
			}
			reader.close();
		} 
		catch (FileNotFoundException e) 
		{
			System.err.println ("Error: File not found. Exiting...");
			e.printStackTrace();
			System.exit(-1);
		} catch (IOException e) 
		{
			System.err.println ("Error: IO exception. Exiting...");
			e.printStackTrace();
			System.exit(-1);
		}
	}
	public boolean searchDict(String search)
	{
		for(int i=0;i<dictionary.size();i++)
		{
			if(dictionary.get(i).equals(search)) //checks to see if word is in dictionary
			{
				return true;
			}
		}
		return false;
	}    	 
}
    
