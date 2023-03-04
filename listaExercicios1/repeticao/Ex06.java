package repeticao;

import javax.swing.JOptionPane;

public class Ex06 {
	
	 public static void main(String[] args) {
	        
	        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro positivo: "));
	        int fatorial = 1;
	        
	        for (int i = num; i > 0; i--) {
	            fatorial *= i;
	        }
	        
	        JOptionPane.showMessageDialog(null, num + "! = " + fatorial);
	    }
}
