import java.util.Scanner;

public class Addition2Number {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n1=sc.nextInt();
		
		System.out.println("Enter a number:");
		int n2=sc.nextInt();
		
		int sum=n1+n2;
		
		System.out.println("Sum of "+n1+ " and "+n2+" is:"+sum);
		
		
	}

}
