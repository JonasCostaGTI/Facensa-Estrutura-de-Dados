package EXG104;

public class Discografia {

	public int codigo;
	public String banda;
	public String album;

	public Discografia(int codigo, String banda, String album) {
		this.codigo = codigo;
		this.banda = banda;
		this.album = album;
	}

	@Override
	public String toString() {
		return "Discografia [codigo=" + codigo + ", banda=" + banda + ", album=" + album + "]";
	}

	
	

}
