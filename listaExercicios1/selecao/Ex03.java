package selecao;

import javax.swing.JOptionPane;

public class Ex03 {

	public static void main(String[] args) {
		int cod;
		Double valor,desconto = null,valorFinal;
		
		valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da compra efetuada: "));
		
		cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu código ! 1-Cliente Comum, 2-Funcionario, 3-Vip "));
		
		switch(cod) {
		case 1:
			desconto = 0.0;
		break;
		case 2:
			desconto = 0.1;
		break;
		case 3:
			desconto = 0.05;
		break;
		default:
			JOptionPane.showMessageDialog(null, "CODIGO INVALIDO,DIGITE NOVAMENTE");
		}
		
		valorFinal = valor - (valor * desconto);
		
		JOptionPane.showMessageDialog(null, "O valor final da sua compra será: " + valorFinal);
	}
}
