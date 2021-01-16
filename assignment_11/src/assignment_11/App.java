package assignment_11;

import ignore.TestingUtils;

import java.util.OptionalInt;

public class App {


	/**

	Given a string, return a string where for every char in the original, append another. 
	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		repeatChar("The")  <b>---></b>"TThhee"<br>
		repeatChar("AAbb")    <b>---></b> "AAAAbbbb" <br>
		repeatChar("Hi-There") <b>---></b> "HHii--TThheerree" <br>
	 */
	
	public static String repeatChar(String str) {

		if ( str != null && str.length() > 0) {
			StringBuilder strBuilder = new StringBuilder();
			//usingToCharArray(str, strBuilder);
			usingStringLoop(str, strBuilder);
			return strBuilder.toString();
		}
		return str;
	}

	private static void usingStringLoop(String str, StringBuilder strBuilder) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			strBuilder.append(ch).append(ch);
		}
	}

	private static void usingToCharArray(String str, StringBuilder strBuilder) {
		char[] chars = str.toCharArray();
		for (char ch : chars) {
			strBuilder.append(ch).append(ch);
		}
	}


	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}
