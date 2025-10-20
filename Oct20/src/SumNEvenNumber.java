import java.util.Scanner;

public class SumNEvenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		int sum=n*(n+1);
		
		System.out.println("Sum of first "+n+" even numbers:"+sum);
		
		sc.close();
	}

}
