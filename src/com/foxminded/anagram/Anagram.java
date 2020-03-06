package com.foxminded.anagram;

import static java.lang.Character.isAlphabetic;

import java.util.Optional;

public class Anagram {
	
	// regex checks multiple blank characters
	private static final String DELIMITER = "((?<= )|(?= ))";

	public String createAnagram(String text) {
		Optional<String> textCheckForNull = Optional.ofNullable(text);
		if (!textCheckForNull.isPresent()) {
			return null;
		}

		String[] words = text.split(DELIMITER);
		StringBuilder result = new StringBuilder();
		
		for (String word : words) {
			result.append(reverseWord(word));
		}
		return result.toString();
	}
	
	private String reverseWord(String word) {		
		char[] chars = word.toCharArray();		
		int leftEdge = 0;
		int rightEdge = chars.length - 1;
		
		while (leftEdge < rightEdge) {
			if (!isAlphabetic(chars[leftEdge])) {
				leftEdge++;
			} else if (!isAlphabetic(chars[rightEdge])) {
				rightEdge--;
			} else {
				swap(chars, leftEdge, rightEdge);
				leftEdge++;
				rightEdge--;
			}
		}		
		return String.valueOf(chars);
	}
	
	private char[] swap(char[] chars, int firstIndex, int secondIndex) {		
		char temp = chars[firstIndex];
		chars[firstIndex] = chars[secondIndex];
		chars[secondIndex] = temp;		
		return chars;
	}
}