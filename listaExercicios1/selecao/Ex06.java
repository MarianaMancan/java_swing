package selecao;

import javax.swing.JOptionPane;

public class Ex06 {

	public static void main(String[] args) {
		double preço, valor = 0, litros;
		int tipoCombustivel;

		tipoCombustivel = Integer
				.parseInt(JOptionPane.showInputDialog("Digite o tipo de combustivel: \n 1-Alcool \n 2- Gasolina"));

		litros = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de litros:"));

		switch (tipoCombustivel) {

		case 1:
			if (litros <= 20) {
				valor = (2.90 * litros * 0.97);
			} else {
				valor = (2.90 * litros * 0.95);
			}
			break;
		case 2:
			if (litros <= 20) {
				valor = (3.30 * litros * 0.96);
			} else {
				valor = (3.30 * litros * 0.94);
			}
			break;
		}

		JOptionPane.showMessageDialog(null, "O valor total será: " + valor);

	}
}