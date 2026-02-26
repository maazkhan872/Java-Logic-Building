package Java_Coding_Working;

 // Check Prime number
public class Boolean_class {

	    public static boolean isPrime(int n) {

	        if (n <= 1) {
	            return false;
	        }

	        for (int i = 2; i <= n / 2; i++) {

	            if (n % i == 0) {
	                return false;
	            }

	        }

	        return true;
	    }

	    public static void main(String[] args) {

	        System.out.println(isPrime(7)); // true
	        System.out.println(isPrime(8)); // false

	    }
	}

// Palindrome Problem
public class Boolean_class{

    public static boolean isPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {

            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("madam")); // true
        System.out.println(isPalindrome("java"));  // false
        System.out.println(isPalindrome("level"));  // true

    }
}

