package be.vdab.palindroom;

public class Woord {
	private final String woord;
	public Woord(String woord) {
		this.woord = woord;
	}
	
	public boolean isPalindroom() {
		String woordReverse = new StringBuilder(woord).reverse().toString();
		return woord.equals(woordReverse);
	}
}
