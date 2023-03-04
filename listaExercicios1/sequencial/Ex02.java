package sequencial;

import javax.swing.JOptionPane;

public class Ex02 {

	public static void main(String[] args){
		   double polegadas;
		   double centimetros;

		   polegadas = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em polegadas"));
		   centimetros = polegadas * 2.54;

		   JOptionPane.showMessageDialog(null, centimetros);


		  }
}
