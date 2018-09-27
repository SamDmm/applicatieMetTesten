package be.vdab.valueobjects;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class JaarTest {

	@Test
	public void eenJaarDeelbaarDoor400IsEenSchrikkeljaar() {
		Jaar jaar = new Jaar(2000);
		assertTrue(jaar.isSchrikkeljaar());
	}
	@Test
	public void eenJaarDeelbaarDoor100IsGeenSchrikkeljaar() {
		assertFalse(new Jaar(1900).isSchrikkeljaar());
	}
	@Test
	public void eenJaarDeelbaarDoor4IsEenSchrikkeljaar() {
		assertTrue(new Jaar(2012).isSchrikkeljaar());
	}
	@Test
	public void eenJaarNietDeelbaarDoor4IsGeenSchrikkeljaar() {
		assertFalse(new Jaar(2015).isSchrikkeljaar());
	}
}
