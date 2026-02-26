package Java_Coding_Working;

/*
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

// Check if String contains only Digits
public class Boolean_class {

    public static boolean isDigits(String str) {

        for (int i = 0; i < str.length(); i++) {

            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }

        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(isDigits("12345")); // true
        System.out.println(isDigits("12a45")); // false

    }
}
*/

public class Boolean_class {

    // Check if a number is even
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Check if a character is a vowel
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    // Check if a person is adult (>= 18)
    public static boolean isAdult(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {
        // Test isEven
        System.out.println("Is 10 even? " + isEven(10)); // true
        System.out.println("Is 7 even? " + isEven(7));   // false

        // Test isVowel
        System.out.println("Is 'A' a vowel? " + isVowel('A')); // true
        System.out.println("Is 'b' a vowel? " + isVowel('b')); // false

        // Test isAdult
        System.out.println("Is age 20 adult? " + isAdult(20)); // true
        System.out.println("Is age 15 adult? " + isAdult(15)); // false
    }
}