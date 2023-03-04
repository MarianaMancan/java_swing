package selecao;

import javax.swing.JOptionPane;

public class Ex04 {

	public static void main(String[] args) {
		double nota1,nota2,media;
		
		
		nota1 =  Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
		nota2 =  Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
		
		media = (nota1 + nota2)/2;
		
		if(media>=6) {
			JOptionPane.showMessageDialog(null, "Parabens voce foi aprovado com media igual a " + media);
		}
		else {
			JOptionPane.showMessageDialog(null, "Reprovado com media igual a " + media);
		}
		
	}
}
