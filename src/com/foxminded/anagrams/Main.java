package com.foxminded.anagrams;

public class Main {

	public static void main(String[] args) {
		
		String stringForProcessing = "";
		ReverseStringProcessor anagramProcessor = new ReverseStringExcludeSpecialCharactersProcessor();
		StringProcessor stringProcessor = new StringProcessor(anagramProcessor);
		
		String result = stringProcessor.process(stringForProcessing);
		
		System.out.println(result);
	}

}
