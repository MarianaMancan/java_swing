package repeticao;

import javax.swing.JOptionPane;

public class Ex03 {
	
	public static void main(String[] args) {
		
		 int n1,n2,soma = 0;
	     n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
	     n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o seguno numero: "));
	     
	     for(int i=n1; i <=n2;i++) {
	    	 soma += i;
	     }
	     
	     JOptionPane.showMessageDialog(null, "O valor total = " + soma);
		}
	}

