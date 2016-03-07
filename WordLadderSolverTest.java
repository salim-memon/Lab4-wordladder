package assignment4;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class WordLadderSolverTest {

	@Test
	public void test() throws NoSuchLadderException {
		WordLadderSolver test = new WordLadderSolver();
		try{
		ArrayList<String> example = (ArrayList<String>) test.computeLadder("stone","money");
		assertEquals(example.get(example.size()-1),"money"); //black box testing/white box testing
		}
		catch(UnsupportedOperationException e)
		{
			System.out.println("Invalid inputs");
		}
		catch(NoSuchLadderException e)
		{
			System.out.println("Invalid inputs");
		}
		try{
			ArrayList<String> example = (ArrayList<String>) test.computeLadder("joe","bob");
			assertEquals(example.get(example.size()-1),"money"); //white box testing
			}
			catch(UnsupportedOperationException e)
			{
				System.out.println("Invalid inputs");
			}
			catch(NoSuchLadderException e)
			{
				System.out.println("Invalid inputs");
			}
		try{
			ArrayList<String> example = (ArrayList<String>) test.computeLadder("mumbo","ghost");
			assertEquals(example.get(example.size()-1),"ghost"); //white box testing
			}
			catch(UnsupportedOperationException e)
			{
				System.out.println("Invalid inputs");
			}
			catch(NoSuchLadderException e)
			{
				System.out.println("Invalid inputs");
			}
		try{
			ArrayList<String> example = (ArrayList<String>) test.computeLadder("asdfa","fdsag");
			assertEquals(example.get(example.size()-1),"ghost"); //white box testing
			}
			catch(UnsupportedOperationException e)
			{
				System.out.println("Invalid inputs");
			}
			catch(NoSuchLadderException e)
			{
				System.out.println("Invalid inputs");
			}
		
	}

}
