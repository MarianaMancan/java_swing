package selecao;

import javax.swing.JOptionPane;

public class Ex05 {

	public static void main(String[] args) {
		int idade;
		
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do nadador: "));
		
		
		if(idade <=4) {
			JOptionPane.showMessageDialog(null, "CATEGORIA INEXISTENTE");
		}
		if(idade>=5 && idade <=7) {
			JOptionPane.showMessageDialog(null, "CATEGORIA: INFANTIL A");
		}
		if(idade>=8 && idade <=10) {
		    JOptionPane.showMessageDialog(null, "CATEGORIA: INFANTIL B");
		}
		if(idade>=11 && idade <=13) {
		    JOptionPane.showMessageDialog(null, "CATEGORIA: JUVENIL A");
		}
		if(idade>=14 && idade <=17) {
		    JOptionPane.showMessageDialog(null, "CATEGORIA: JUVENIL B");
		}
		if(idade>=18) {
		    JOptionPane.showMessageDialog(null, "CATEGORIA: ADULTO");
		}
		
	}
}
