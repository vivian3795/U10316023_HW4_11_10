/**
 * ID: U10316023 
 * Ex: 11.10 
 * Information:
 *		test class was designed with the requirements on page 462. 
 */

 //import Scanner
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		//create a scanner named input
		Scanner input = new Scanner(System.in);
		//create a MyStack named stack
		MyStack stack = new MyStack();
    
		//let user know that he/she should enter five strings
		System.out.println("enter five strings ");
		//prompt the user to enter five strings
		for (int i = 0; i < 5; i++)
			stack.push(input.nextLine());
		
		//display them in reverse order
		System.out.println("\n"+stack.getSize() + " strings are: ");
		while (!stack.isEmpty())
			System.out.println(stack.pop());
	}
}
