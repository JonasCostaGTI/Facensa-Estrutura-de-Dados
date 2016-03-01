package EXG101;

import javax.swing.JOptionPane;

public class Fatorial {

	public static void main(String[] args) {
		Integer numero = Integer.parseInt( JOptionPane.showInputDialog(null, "Número:") ), 
				fatorial = 1;
	
		for (int passo = 1; passo <= numero; passo++) {
			fatorial *= passo;
		}
		
		JOptionPane.showMessageDialog(null, "O fatorial de"+numero+" é "+fatorial+"!");

	}

}
