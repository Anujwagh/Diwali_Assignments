import java.util.Scanner;

public class CheckArmstrong {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n=sc.nextInt();

		int original=n;
		int sum=0;
		
		int digits=String.valueOf(n).length();
		
		while(n!=0)
		{
			int digit = n%10;
			sum+=Math.pow(digit, digits);
			n=n/10;
		}
		
		if(sum==original)
		{
			System.out.println("It is a Armstrong number.");
		}
		else
		{
			System.out.println("It is not a Armstrong number.");
		}
		
		sc.close();
	}
	

}
