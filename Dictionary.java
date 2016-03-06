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
		dictionary = null;
	}
	public void createDictionary()
	{
		try 
		{
			FileReader freader = new FileReader("A4-words.txt");
			BufferedReader reader = new BufferedReader(freader);
			
			for (String s = reader.readLine(); s != null; s = reader.readLine()) 
			{
				if(!(s.startsWith("*")))
					dictionary.add((s.split("//s+"))[0]);
				
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
			if(dictionary.get(i).equals(search))
			{
				return true;
			}
		}
		return false;
	}
	public ArrayList<String> sortTemp(ArrayList<String> temp, String compareWord)
    {
    	int counter;    	
    	for(int i =0;i<temp.size();i++)
    	{
    		counter=0;
    		for(int j =0;j<temp.get(i).length();j++)
    		{
    			if(temp.get(i).charAt(j) != compareWord.charAt(j))
    			{
    				counter++;
    			}
   			}
    		String word = temp.get(i);
    		if(i==0)
    		{
    			temp.add(word+counter);//very first value to be added
    		}
    		for(int x=0;x<i;x++)
    		{
    			if(Integer.parseInt(temp.get(x))>counter || Integer.parseInt(temp.get(x))==counter)
    			{
    	    		temp.add(x,word+counter);
    			}
    			else
    			{
    				if(x+1!=temp.size())
    				{
    					temp.add(x+1, word+counter);
    				}
    				else
    					temp.add(word+counter);
    			}
    		}
   		}
    	return temp;
    }
    //	String [] temparr = (String[]) temp.toArray();
    /*	 for (int i = 1; i < temparr.length; i++)
    	 {
             int j = i;
             int B = Integer.parseInt(temparr[i];
             while ((j > 0) && (nos[j-1] > B))
             {
               temparr[j] = temparr[j-1];
               j--;
             }
             temparr[j] = B;
    	
    }*/
    	 
}
    
