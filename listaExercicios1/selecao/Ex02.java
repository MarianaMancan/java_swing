package selecao;

import javax.swing.JOptionPane;

public class Ex02 {
 
	public static void main(String[] args){
        Integer numeroMaca;
        Double valorTotal;
        
        numeroMaca = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de maças: "));
        
        if(numeroMaca >= 12){
            valorTotal = numeroMaca * 1.00;
        }
        else{
            valorTotal = numeroMaca * 1.30;
        }
        
        JOptionPane.showMessageDialog(null, "o valor das maças sera " + valorTotal);
    }
}
