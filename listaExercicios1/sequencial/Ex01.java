package sequencial;

import javax.swing.JOptionPane;

public class Ex01 {

	 public static void main(String[] args){
	        int numero,antecessor,sucessor;
	        
	       numero   =  Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
	       antecessor = numero - 1;
	       sucessor = numero + 1;
	       JOptionPane.showMessageDialog(null,"O antecessor sera: " + antecessor);
	       JOptionPane.showMessageDialog(null,"O sucessor sera: " + sucessor);
	       
	    }
}
