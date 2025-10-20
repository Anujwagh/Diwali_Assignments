import java.util.Scanner;

public class ReversedNumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int reversed = 0;
        boolean isNegative = false;

        
        if (n < 0) {
            isNegative = true;
            n = -n; 
        }

        
        while (n != 0) {
            int digit = n % 10;             
            reversed = reversed * 10 + digit; 
            n = n / 10;                     
        }

        if (isNegative) {
            reversed = -reversed;
        }

        System.out.println("Reversed number is: " + reversed);

        sc.close();
    }
}
