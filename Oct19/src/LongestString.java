
public class LongestString {
	
    public static void main(String[] args) {
        
        String[] arr = {"Rahul", "Kartik", "Virat", "MSDhoni", "Rohit"};

        int maxLength = 0;

        
        for (String a : arr) {
            if (a.length() > maxLength) {
                maxLength = a.length();
            }
        }

        System.out.println("Length of the longest string: " + maxLength);
    }
}
