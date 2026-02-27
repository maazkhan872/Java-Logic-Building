package Java_Coding_Working;


// Concatenation
public class Java_string {
	
	public static void main(String args[]) {
	String name = "Maaz";    
	name = name.concat(" Khan"); // concat() does NOT modify the original string.

	System.out.println(name);
}
}


public class Java_string {
	
	public static void main(String args[]) {
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");

		System.out.println(s1 == s2); // true
		System.out.println(s1 == s3); // false
		System.out.println(s1.equals(s3)); // true
	}
}    // == compares memory reference
     // equals() compares actual content


public class Java_string {
	
	public static void main(String args[]) {
		
		String text = "Java";
		System.out.println(text.length());
		System.out.println(text.toUpperCase());
		System.out.println(text.toLowerCase());
		System.out.println(text.charAt(2));
		System.out.println(text.substring(0,4));
		System.out.println(text.substring(4));
		System.out.println(text.contains("Boot"));
		System.out.println(text.replace("easy", "powerful"));
		System.out.println(text.trim());  // remove extra space
		
	}
}

// split()
public class Java_string {
	
	public static void main(String args[]) {
		String text = "Java,Python,C++";

		String[] languages = text.split(",");

		for(String lang : languages){
		    System.out.println(lang);
		}
	}
}

// Reverse a String
public class Java_string {
    public static void main(String[] args) {

        String input = "Java";
        String reversed = "";

        for(int i = input.length() - 1; i >= 0; i--){
            reversed += input.charAt(i);
        }

        System.out.println("Reversed: " + reversed);
    }
}

// Palindrome problem
public class Java_string {
    public static void main(String[] args) {

        String word = "java";
        String reversed = "";

        for(int i = word.length() - 1; i >= 0; i--){
            reversed += word.charAt(i);
        }

        if(word.equals(reversed)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
} 

// Count vowels
public class Java_string {
    public static void main(String[] args) {

        String text = "Java Programming";
        int count = 0;

        text = text.toLowerCase();

        for(int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }

        System.out.println("Vowels: " + count);
    }
}