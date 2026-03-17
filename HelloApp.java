/*HelloApp - A simple java application that displays "Hello World!" to the console
*@author Harshita
*@version 4.0
*/

public class HelloApp {
	public static void main(String[] args){
		StringBuilder nameBuilder = new StringBuilder();
		boolean first = true;
		for (String name : args){
			if (!first){
				nameBuilder.append(", ");
			}
			nameBuilder.append(name);
			first = false;
		}
		System.out.println("Hello, " + nameBuilder.toString() + "!");
	}
}