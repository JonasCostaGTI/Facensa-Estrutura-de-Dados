package EXG104;

public class NodoDisco {
	public NodoDisco proximo = null;
	public Discografia discografia = null;
	public NodoDisco anterior = null; 

	public NodoDisco(Discografia discografia) {
		this.discografia  = discografia;
	}

	@Override
	public String toString() {
		return this.discografia.toString();
	}
	
	
	
	

}
