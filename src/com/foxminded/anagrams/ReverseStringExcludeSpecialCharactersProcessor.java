package com.foxminded.anagrams;

import java.util.Arrays;

public class ReverseStringExcludeSpecialCharactersProcessor implements ReverseStringProcessor {

	@Override
	public String createAnagram(String stringForProcess) {
				
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
		
		return Arrays.toString(arrayForProcess);
	}
	
	private char[] swap(char[] charArray, int firstIndex, int secondIndex) {
		
		char temp = charArray[firstIndex];
		charArray[firstIndex] = charArray[secondIndex];
		charArray[secondIndex] = temp;
		
		return charArray;
	}

}
