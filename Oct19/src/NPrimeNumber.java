import java.util.Scanner;

public class NPrimeNumber {
	
	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
				
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		
		System.out.println("Prime number upto "+n+" are:");
		for(int i=2;i<=n;i++) {
			if(isPrime(i)) {
				System.out.println(i +" ");
			}
		}
		sc.close();
	}

}




//import java.util.Scanner;
//
//public class NPrimeNumber {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int n = sc.nextInt();
//
//        System.out.println("Prime numbers up to " + n + " are:");
//        for (int i = 2; i <= n; i++) {
//            if (isPrime(i))
//                System.out.print(i + " ");
//        }
//
//        sc.close();
//    }
//
//    // Method to check if a number is prime
//    public static boolean isPrime(int num) {
//        if (num <= 1)
//            return false;
//
//        for (int i = 2; i <= Math.sqrt(num); i++) {
//            if (num % i == 0)
//                return false;
//        }
//        return true;
//    }
//}
