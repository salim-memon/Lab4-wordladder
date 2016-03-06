/*
    ADD YOUR HEADER HERE
 */

package assignment4;

import java.util.List;
import java.util.ArrayList;

// do not change class name or interface it implements
public class WordLadderSolver implements Assignment4Interface
{
	protected Dictionary dict;
	protected ArrayList<String> solutionList;
	char[] Alphabets = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    // add a constructor for this object. HINT: it would be a good idea to set up the dictionary there
	public WordLadderSolver()
	{
		solutionList= new ArrayList<String>();
		dict = new Dictionary();
	}
    // do not change signature of the method implemented from the interface
    @Override
    public List<String> computeLadder(String startWord, String endWord) throws NoSuchLadderException 
    {
        if(startWord.length()==5 && endWord.length()==5 && dict.searchDict(endWord) && dict.searchDict(startWord)) //checks to see if the word is valid and length is five
        {
        	if(MakeLadder(startWord, endWord, -1))
        	{
        		solutionList.add(endWord);
        		for(String words : solutionList){
        			System.out.println(words);
        		}
        		System.out.println("**********");
        		return solutionList; //-1 indicates that it is the first recursive call
        	}
        	else{
        		throw new UnsupportedOperationException("Word ladder does not exist for these two inputs");
        	}
        }
        else if(startWord.length()!=5 || endWord.length()!=5)
        {
        	throw new UnsupportedOperationException("Inputted words are of incorrect length");
        }
        else if(!dict.searchDict(endWord) || !dict.searchDict(startWord)) 
        {
        	System.out.println("Inputted words are not in dictionary");
        	//throw new UnsupportedOperationException("Inputted words are not in dictionary");
        }
        return null;
    }

    @Override
    public boolean validateResult(String startWord, String endWord, List<String> wordLadder) 
    {
    	System.out.println("Not implemented yet!");
    	return false;
        //throw new UnsupportedOperationException("Not implemented yet!");
    }

    // add additional methods here
    public boolean MakeLadder(String startWord, String endWord, int index){
    	boolean validWord = false;
    	int position=0;
    	ArrayList<String> candidateList = new ArrayList<String>();
    	if(solutionList.contains(startWord))
    		return false;
    	solutionList.add(startWord);
		boolean outOrNot = false;
    	while(!outOrNot){
    		switch (index){
    		
    		case -1:
    			for(char character : Alphabets){
    				for(int i = 0; i < 5; i+= 1){
    					if(startWord.charAt(i)!= character){
    						StringBuilder trialWord = new StringBuilder(startWord);
    						trialWord.setCharAt(i, character);
    						String tempWord = trialWord.toString();
    						if(dict.searchDict(tempWord)){
    							if(!(candidateList.contains(tempWord))){
    								candidateList.add(tempWord);
    								candidateList = sortTemp(candidateList, endWord);
    							}
    						}	
    					}
    				}
    			}
    			outOrNot = true;
    			break;
    		case 0:
    			for(char character : Alphabets){
    				for(int i = 0; i < 5; i+= 1){
    					if(i != 0){
    						if(startWord.charAt(i)!= character){
    							StringBuilder trialWord = new StringBuilder(startWord);
        						trialWord.setCharAt(i, character);
        						String tempWord = trialWord.toString();
        						if(dict.searchDict(tempWord)){
        							if(!(candidateList.contains(tempWord))){
        								candidateList.add(tempWord);
        								candidateList = sortTemp(candidateList, endWord);
        							}
        						}	
    						}
    					}
    				}
    			}
    			outOrNot = true;
    			break;
    		case 1:
    			for(char character : Alphabets){
    				for(int i = 0; i < 5; i+= 1){
    					if(i != 1){	
    						if(startWord.charAt(i)!= character){
    							StringBuilder trialWord = new StringBuilder(startWord);
        						trialWord.setCharAt(i, character);
        						String tempWord = trialWord.toString();
        						if(dict.searchDict(tempWord)){
        							if(!(candidateList.contains(tempWord))){
        								candidateList.add(tempWord);
        								candidateList = sortTemp(candidateList, endWord);
        							}
        						}
    						}
    					}
    				}
    			}
    			outOrNot = true;
    			break;
    		case 2:
    			for(char character : Alphabets){
    				for(int i = 0; i < 5; i+= 1){
    					if(i != 2){
    						if(startWord.charAt(i)!= character){
    							StringBuilder trialWord = new StringBuilder(startWord);
        						trialWord.setCharAt(i, character);
        						String tempWord = trialWord.toString();
        						if(dict.searchDict(tempWord)){
        							if(!(candidateList.contains(tempWord))){
        								candidateList.add(tempWord);
        								candidateList = sortTemp(candidateList, endWord);
        							}
        						}
    						}
    					}
    				}
    			}
    			outOrNot = true;
    			break;
    		case 3:
    			for(char character : Alphabets){
    				for(int i = 0; i < 5; i+= 1){
    					if(i != 3){
    						if(startWord.charAt(i)!= character){
    							StringBuilder trialWord = new StringBuilder(startWord);
        						trialWord.setCharAt(i, character);
        						String tempWord = trialWord.toString();
        						if(dict.searchDict(tempWord)){
        							if(!(candidateList.contains(tempWord))){
        								candidateList.add(tempWord);
        								candidateList = sortTemp(candidateList, endWord);
        							}
        						}
    						}
    					}
    				}
    			}
    			outOrNot = true;
    			break;
    		case 4:
    			for(char character : Alphabets){
    				for(int i = 0; i < 5; i+= 1){
    					if(i != 4){
    						if(startWord.charAt(i)!= character){
    							StringBuilder trialWord = new StringBuilder(startWord);
        						trialWord.setCharAt(i, character);
        						String tempWord = trialWord.toString();
        						if(dict.searchDict(tempWord)){
        							if(!(candidateList.contains(tempWord))){
        								candidateList.add(tempWord);
        								candidateList = sortTemp(candidateList, endWord);
        							}
        						}
    						}
    					}
    				}
    			}
    			outOrNot = true;
    			break;
    		}
    	}
    	if(candidateList.size()==0){
    		solutionList.remove(startWord);
    		return false;
    	}
    	if(candidateList.get(0).substring(candidateList.get(0).length()-1).equals("1")){
    		solutionList.add(candidateList.get(0).substring(0, 5));
    		return true;
    	}
    	else if (candidateList.get(0).substring(candidateList.get(0).length()-1).equals("0"))
    		return true;
    	else{
    		String newWord = candidateList.get(0).substring(0, (candidateList.get(0).length()-1));
    		for(int i = 0; i < 5; i+=1){
    			if (newWord.charAt(i)!= startWord.charAt(i))
    				position = i;
    		}
    	for(int i=0;i<candidateList.size();i+=1){
    			newWord = candidateList.get(i).substring(0, (candidateList.get(i).length()-1));
    			validWord = MakeLadder(newWord, endWord, position);
    	   		if(validWord)
    	   			break;
    	}
    	if(validWord){
    		return true;
    	}
    		else{
    			return false;
    		}
    	}
    }
    public ArrayList<String> sortTemp(ArrayList<String> temp, String compareWord)
    {
    	int counter;    	
    	ArrayList<String> newTemp = new ArrayList<String>();
    	for(int i =0;i<temp.size();i++)
    	{
    		counter=0;
    		for(int j =0;j<5;j++)
    		{
    			if(temp.get(i).charAt(j) != compareWord.charAt(j))
    			{
    				counter++;
    			}
   			}
    		String word = temp.get(i).substring(0,5);
    		if(i==0)
    		{
    			newTemp.add(word+counter);//very first value to be added
    		}
    		else{
    		for(int x=0;x<i;x++)
    		{
    			if(Integer.parseInt(newTemp.get(x).substring(newTemp.get(x).length()-1))>counter || Integer.parseInt(newTemp.get(x).substring(newTemp.get(x).length()-1))==counter)
    			{
    	    		newTemp.add(x,word+counter);
    	    		break;
    			}
    			else
    			{
    				if(x+1!=newTemp.size())
    				{
    					newTemp.add(x+1,word+counter);
    					break;
    				}
    				else{
    					newTemp.add(word+counter);
    					break;
    				}
    			}
    		}
   		}
    }
    	return newTemp;
    }

}
