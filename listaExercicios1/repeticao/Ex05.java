package repeticao;

import javax.swing.JOptionPane;

public class Ex05 {
	
	  public static void main(String[] args) {

	        int chico = 150;
	        int juca = 110;
	        int anos = 0;

	        while (juca <= chico) {
	            chico += 2;
	            juca += 3;
	            anos++;
	        }

	        JOptionPane.showMessageDialog(null, "Serão necessários " + anos + " anos para que Juca seja maior que Chico.");
	    }

}
