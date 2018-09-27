package be.vdab.palindroom;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class WoordTest {

	@Test
	public void woordIsPalindroom() {
		assertTrue(new Woord("lepel").isPalindroom());
	}
	@Test
	public void woordIsGeenPalindroom() {
		assertFalse(new Woord("bizon").isPalindroom());
	}
	@Test
	public void eenLegeStringIsEenPalindroom() {
		assertTrue(new Woord("").isPalindroom());
	}

}
