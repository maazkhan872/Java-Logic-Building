package Java_Coding_Working;

import java.util.*;
import java.util.stream.*;


// Even Numbers Filter + Square
public class Stream {
	    public static void main(String[] args) {
	        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

	        list.stream()
	            .filter(n -> n % 2 == 0)   // even numbers
	            .map(n -> n * n)           // square
	            .forEach(System.out::println); // print
	    }
	}

// Count Strings Starting with "A"
public class Stream{
     public static void main(String[] args) {
	  List<String> names = Arrays.asList("Ali", "Ahmed", "Sara", "Ayan", "Zain");

      long count = names.stream()
	                   .filter(name -> name.startsWith("A"))
	                   .count();

	        System.out.println(count);
	    }
	}