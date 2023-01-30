package CSCI1010;

public class Pair {
	private String original;
	private String shuffled;
	public Pair(String original, String shuffled) {
		super();
		this.original = original;
		this.shuffled = shuffled;
	}
	public Pair() {
		super();
	}
	public String getOriginal() {
		return original;
	}
	public void setOriginal(String original) {
		this.original = original;
	}
	public String getShuffled() {
		return shuffled;
	}
	public void setShuffled(String shuffled) {
		this.shuffled = shuffled;
	}
}
