package com.foxminded.anagram;

import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		Anagram anagram = new Anagram();		
		System.out.println("Please enter words for reversing.");
		
		while (scanner.hasNext()) {
			String text = scanner.nextLine();
			System.out.println(anagram.createAnagram(text));			
		}		
		scanner.close();
	}
}
