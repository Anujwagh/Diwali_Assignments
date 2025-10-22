import java.util.Scanner;

public class SumNOddNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();

		int sum = n * n;

		System.out.println("Sum of first " + n + " odd numbers:" + sum);

		sc.close();

	}

}
