package test.java.com.foxminded.anagram;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.java.com.foxminded.anagram.Anagram;

class AnagramTest {

	@Test
	void testCreateAnagram() {
		Anagram anagram = new Anagram();

		assertEquals("", anagram.createAnagram(""));
		assertEquals("a", anagram.createAnagram("a"));
		assertEquals("d1cba hgf!e", anagram.createAnagram("a1bcd efg!h"));
	}

}
