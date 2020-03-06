package com.foxminded.anagram;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AnagramTest {

	Anagram anagram = new Anagram();

	@Test
	void testEmptyString() {
		assertEquals("", anagram.createAnagram(""));
	}

	@Test
	void testNullString() {
		Assertions.assertThrows(NullPointerException.class, () -> {
			anagram.createAnagram(null);
		});
	}

	@Test
	void testOneAlphabeticalSymbol() {
		assertEquals("a", anagram.createAnagram("a"));
	}

	@Test
	void testOneSpecialSymbol() {
		assertEquals("@", anagram.createAnagram("@"));
	}

	@Test
	void testOneAlphabeticalWord() {
		assertEquals("cba", anagram.createAnagram("abc"));
	}

	@Test
	void testOneSpecialSymbolWord() {
		assertEquals("@!#$", anagram.createAnagram("@!#$"));
	}

	@Test
	void testCombinedPhrase() {
		assertEquals("d1cba hgf!e", anagram.createAnagram("a1bcd efg!h"));
	}

	@Test
	void testMoreThanOneBlankCharacter() {
		assertEquals("d1cba   hgf!e", anagram.createAnagram("a1bcd   efg!h"));
	}
}
