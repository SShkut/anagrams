package com.foxminded.anagram;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnagramTest {

	private Anagram anagram;

	@BeforeEach
	void initialize() {
		anagram = new Anagram();
	}

	@Test
	void givenEmptyText_whenCreateAnagram_thenEmptyText() {
		assertEquals("", anagram.createAnagram(""));
	}

	@Test
	void givenNullValue_whenCreateAnagram_thenNullValue() {
		assertEquals(null, anagram.createAnagram(null));
	}

	@Test
	void geivenOneLetter_whenCreateAnagram_thenSameLetter() {
		assertEquals("a", anagram.createAnagram("a"));
	}

	@Test
	void givenSpecialSymbol_whenCreateAnagram_thenSameSymbol() {
		assertEquals("@", anagram.createAnagram("@"));
	}

	@Test
	void givenAphabeticalWord_whenCreateAnagram_thenReversedWord() {
		assertEquals("cba", anagram.createAnagram("abc"));
	}

	@Test
	void givenNotAlphabeticalSequence_whenCreateAnagram_thenSameNotAlphabeticalSequence() {
		assertEquals("@!#$1", anagram.createAnagram("@!#$1"));
	}

	@Test
	void givenSentenceWithAllCharacters_whenCreateAnagram_thenReverseEachWordExceptNotAlphabeticalCharacters() {
		assertEquals("d1cba hgf!e", anagram.createAnagram("a1bcd efg!h"));
	}

	@Test
	void givenSentenceWithMultipleSpaces_whenCreateAnagram_thenPreserveNumberOfSpacesAndReverseEachWord() {
		assertEquals("d1cba   hgf!e", anagram.createAnagram("a1bcd   efg!h"));
	}
}
