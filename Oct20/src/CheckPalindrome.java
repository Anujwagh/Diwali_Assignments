import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		int original=n;
		int reversed=0;
		
		while(n!=0)
		{
			int digit=n%10;
			reversed= reversed*10 + digit;
			n = n/10;
			
		}
		
		if(original==reversed)
		{
			System.out.println(reversed+" is a plindrome number.");
		}
		else
		{
			System.out.println(reversed+" is not a plindrome number.");
		}
		
		sc.close();
	}

}
