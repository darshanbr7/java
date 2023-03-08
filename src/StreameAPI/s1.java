package StreameAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class s1 {

	public static void main(String[] args) {
		 List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig");

	        // Filter out words that start with the letter "a"
	        List<String> filteredWords = words.stream()
	                .filter(word -> !word.startsWith("a"))
	                .collect(Collectors.toList());
	        System.out.println(filteredWords);
	}

}
