import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		
		// Variable Declaration
		int n;
		
		//Scanner object for user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number : ");
		n = sc.nextInt();
		
		//Repeat the loop till n greater than 0
		while( n > 0 ) {
			//Get the digit of Number by MOD
			int r = n % 10;
			System.out.println(r);
			// Delete the Last Digit
			n = n / 10;
		}

	}

}
