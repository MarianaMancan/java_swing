package selecao;

import javax.swing.JOptionPane;

public class Ex01 {

	  public static void main(String[] args){
	        Integer numero1,numero2;
	        
	        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
	        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero: "));
	        
	        if(numero1 == numero2){
	            JOptionPane.showMessageDialog(null, "Os numero sao iguais");
	        }
	        else{
	            JOptionPane.showMessageDialog(null, "Os numeros sao diferentes");
	        }
	    }
}
