/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex03;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class teste {
    
    public static void main (String[] args){
         Poupanca conta1 = new Poupanca(2,2000.00);
    
          conta1.aplicarJuros(0.10);
          
          JOptionPane.showMessageDialog(null,"saldo: " +  conta1.getSaldo());
    }
    
    
   
}
