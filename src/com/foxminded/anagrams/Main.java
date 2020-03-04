package com.foxminded.anagrams;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Anagram anagram = new Anagram();
		
		System.out.println("Please enter words for reversing.");

		
		while (input.hasNext()) {
			StringBuilder result = new StringBuilder();
			String words = input.nextLine();
			result.append(anagram.createAnagram(words));
			System.out.println(result.toString());			
		}
				
		input.close();
	}

}
