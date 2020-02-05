import java.util.Scanner;
public class PracticeWeek22 {
/*
 * @author Izabella Cruz
 * created: 2/5/20
 * description: Input 3 numbers that are entered by the user
 */
public static void main(String[] args) { 
	Scanner keyboard = new Scanner (System.in);
	int number1 = 0;
	int number2 = 0;
	int number3 = 0;
	
	System.out.println ("Enter a number ");
	number1 = keyboard.nextInt();
	
	System.out.println ("Enter a second number ");
	number2 = keyboard.nextInt();
	
	System.out.println ("Enter a third number ");
	number3 = keyboard.nextInt();
	
	int total = number1 * number2 * number3;
	System.out.println("Your total is " +total);
}
}
