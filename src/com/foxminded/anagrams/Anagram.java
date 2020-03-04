package com.foxminded.anagrams;

import java.util.Arrays;

public class Anagram {

	public String createAnagram(String stringForProcess) {
		
		if (stringForProcess.length() <= 1) {
			return stringForProcess;
		}
		
		String[] words = stringForProcess.split(" ");
		
		StringBuilder result = new StringBuilder();
		
		for (String word : words) {
			result.append(reverseWord(word));
			result.append(" ");
		}		
		
		return result.toString();
	}
	
	private char[] swap(char[] charArray, int firstIndex, int secondIndex) {
		
		char temp = charArray[firstIndex];
		charArray[firstIndex] = charArray[secondIndex];
		charArray[secondIndex] = temp;
		
		return charArray;
	}
	
	private String reverseWord(String stringForProcess) {
		
		char[] arrayForProcess = stringForProcess.toCharArray();		
		int leftEdge = 0;
		int rightEdge = arrayForProcess.length - 1;
		
		while (leftEdge < rightEdge) {
			if (!Character.isAlphabetic(arrayForProcess[leftEdge])) {
				leftEdge++;
			} else if (!Character.isAlphabetic(arrayForProcess[rightEdge])) {
				rightEdge--;
			} else {
				swap(arrayForProcess, leftEdge, rightEdge);
				leftEdge++;
				rightEdge--;
			}
		}
		
		return String.valueOf(arrayForProcess);
	}

}
