package com.foxminded.anagrams;

public class StringProcessor {
	
	private ReverseStringProcessor anagramProcessor;

	public StringProcessor(ReverseStringProcessor anagramProcessor) {
		this.anagramProcessor = anagramProcessor;
	}	

	public String process(String stringForProcess) {
		
		if (stringForProcess.length() <= 1) {
			return stringForProcess;
		}
		
		String[] splittedString = stringForProcess.split(" ");
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < splittedString.length; i++) {
			String anagram = anagramProcessor.createAnagram(splittedString[i]);
			result.append(anagram);
			result.append(" ");
		}
		
		
		return result.toString();
	}
}
