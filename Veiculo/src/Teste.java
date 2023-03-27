
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Teste {
    public static void main(String[] args) {
        float valor = (float) 1000.00;
        DecimalFormat df = new DecimalFormat("#,###.00");
       
        Veiculo v1= new Veiculo("sedan","honda","1998", valor);
      
        JOptionPane.showMessageDialog(null, "O valor final do carro será: " +    df.format(v1.valorFinal(valor)) );
        JOptionPane.showMessageDialog(null, "Modelo: " +   v1.getModelo() + "\nMarca: " + v1.getMarca()+
                "\nAno: "+ v1.getAno());
    }
}
