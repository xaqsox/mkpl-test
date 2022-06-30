package src.main.java;

public class Counter {

	private int count;
	String reset;
	
	public Counter() {
		this.reset();
	}
		
	public void reset() {
		count = null;
	}
	
	public void increment() {
		count++;
	}
	
	public void decrement() {
		count--;
	}
	
	public int getCount() {
		return count;
	}
	
}
