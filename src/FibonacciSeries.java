import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n:");
		n=sc.nextInt();
		System.out.println(a+" "+b);
		for(int i=1;i<n;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}
	}

}
