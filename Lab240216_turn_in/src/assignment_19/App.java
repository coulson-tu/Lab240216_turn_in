package assignment_19;

import ignore.TestingUtils;

public class App {


	/**
	 * 
	
	Given a string that contains a single pair of brackets, compute recursively a new string made of 
	only of the brackets and their contents, so "xyz[abc]123" yields "[abc]".

	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		insideBrackets("xyz[abc]123") <b>---></b> [abc]<br>
		insideBrackets("x[hello]") <b>---></b> [hello] <br>
		insideBrackets("[xy]1") <b>---></b> [xy] <br>
	 */
	
	public static String insideBrackets(String str) {
	
		// complete the body of this method
		//base case: the str is empty or does not contain a bracket 
		if(str == null || !str.contains("[") || !str.contains("]")){
			return "";
		}

		//let's start the recursion
		//if the first cahracter is not "[" then remove it until it is
		if(str.charAt(0)!='['){
			return insideBrackets(str.substring(1));
		}
		//Since the first character is "[", then iterate the new str to find the closing bracket
		else{
			int endIndex = 0;
			for(int i=1 ; i<str.length() ; i++){
				if (str.charAt(i)==']'){
					endIndex = i;
					break;
				}
			}
		//As we have found the closing bracket, let's return the required result
			return str.substring(0, endIndex+1);
		}
			
		


			
		
		
		
	}


	
	
	

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}

