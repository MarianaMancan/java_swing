package repeticao;

import javax.swing.JOptionPane;

public class Ex04 {

	public static void main(String[] args) {
	
		double valor = 0,media,maiorValor = 0,valores = 0;
		
		for(int i = 0;i<15;i++) {
			
		valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto " + i + ": "));	
			
		if(valor> maiorValor) {
			maiorValor = valor;
		 }
		}
		valores += valor;
		media = (valores/15);
		
		JOptionPane.showInputDialog("O maior valor será " + maiorValor + " e a media será " + media);
	}
}
