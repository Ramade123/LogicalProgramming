import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		//variable declare
		int n,sum=0;
		
		//scanner object for user input
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any number:");
		n =sc.nextInt();
		
		//Repeat the loop till the number is reached
		for(int i=1; i < n; i++) {
			//Checking for the Divisor of n
			if(n % i== 0) {
				sum = sum + i;
				System.out.println(i+" is Divisior and Sum : "+sum);
			}
		}
		
		// Checking for Sum of all divisor are same as given Number
		if(sum == n) {
			System.out.println(n+" is perfect number ");
		}
		else
			System.out.println(n+" is not perfect number");
		
			}
		}

	


