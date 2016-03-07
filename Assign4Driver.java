package assignment4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Assign4Driver
{
    public static void main(String[] args)
    {
        // Create a word ladder solver object
        String [] temp;    
        try 
		{
			FileReader freader = new FileReader("A4-test.txt");
			BufferedReader reader = new BufferedReader(freader);
			for (String s = reader.readLine(); s != null; s = reader.readLine()) 
			{
				Assignment4Interface wordLadderSolver = new WordLadderSolver();
				temp = s.split("\\s+");
				if(temp.length!=1)
				{
					if(temp[1].equals(temp[0]))
					{
						System.out.println(temp[1]);
						System.out.println(temp[1]);
						System.out.println("**********");
					}
					else
					{
						try{
							List<String> result = wordLadderSolver.computeLadder(temp[0], temp[1]); //if input at end of text file is a blank line, catches that error
							}
						catch(UnsupportedOperationException e)
						{	
							e.printStackTrace();	//prints specific error message and what line it occurs
						}
						catch (NoSuchLadderException e) 
						{
				        	e.printStackTrace(); //prints specific error message and what line it occurs at
						}
					}
				}
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
}
