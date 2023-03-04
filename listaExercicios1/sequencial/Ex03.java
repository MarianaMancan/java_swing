package sequencial;

import javax.swing.JOptionPane;

public class Ex03 {

	   public static void main(String[] args){
	        Double custoFabrica,valorDistribuidor,valorImpostos,valorFinal;
	        
	        custoFabrica = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de fábrica do carro: "));
	        valorDistribuidor =  (custoFabrica * 0.28);
	        valorImpostos = (custoFabrica * 0.45);
	        valorFinal = custoFabrica + valorDistribuidor + valorImpostos;
	        JOptionPane.showMessageDialog(null, "O valor final do carro saira: " + valorFinal);
	        
	        
	    }
}
