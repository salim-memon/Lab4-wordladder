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
        	if(computeLadder(startWord, endWord, -1));	
        	{
        		return solutionList; //-1 indicates that it is the first recursive call
        	}
        	else
        	{
        		throw new UnsupportedOperationException("Word ladder does not exist for these two inputs");
        	}
        }
        else if(startWord.length()!=5 || endWord.length()!=5)
        {
        	throw new UnsupportedOperationException("Inputted words are of incorrect length");
        }
        else if(!dict.searchDict(endWord) || !dict.searchDict(startWord)) 
        {
        	throw new UnsupportedOperationException("Inputted words are not in dictionary");
        }
    }

    @Override
    public boolean validateResult(String startWord, String endWord, List<String> wordLadder) 
    {
        throw new UnsupportedOperationException("Not implemented yet!");
    }

    // add additional methods here
    public boolean MakeLadder(String startWord, String endWord, int index){
    	int position;
    	ArrayList<String> candidateList = new ArrayList<String>();
    	solutionList.add(startWord);
    	while(true){
    		switch (index){
    		
    		case -1:
    			for(char character : Alphabets){
    				for(int i = 0; i < 5; i+= 1){
    					if(startWord.charAt(i)!= character){
    						StringBuilder trialWord = new StringBuilder(startWord);
    						trialWord.setCharAt(i, character);
    						String tempWord = trialWord.toString();
    						if(dict.searchDict(tempWord)){
    							candidateList.add(tempWord);
    							candidateList = sortTemp(candidateList, tempWord);
    						}	
    					}
    				}
    			}
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
        							candidateList.add(tempWord);
        							candidateList = sortTemp(candidateList, tempWord);
        						}	
    						}
    					}
    				}
    			}
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
        							candidateList.add(tempWord);
        							candidateList = sortTemp(candidateList, tempWord);
        						}
    						}
    					}
    				}
    			}
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
        							candidateList.add(tempWord);
        							candidateList = sortTemp(candidateList, tempWord);
        						}
    						}
    					}
    				}
    			}
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
        							candidateList.add(tempWord);
        							candidateList = sortTemp(candidateList, tempWord);
        						}
    						}
    					}
    				}
    			}
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
        							candidateList.add(tempWord);
        							candidateList = sortTemp(candidateList, tempWord);
        						}
    						}
    					}
    				}
    			}
    			break;
    		}
    	}
    	
    	MakeLadder(newWord, endWord, position);
		return false;
    }
}
