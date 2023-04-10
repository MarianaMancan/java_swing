/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex03;

/**
 *
 * @author Aluno
 */
public class Poupanca extends Conta{
    
    private double juros;
    
    public Poupanca(int conta, double saldo) {
        super(conta, saldo);
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }
    
    public void aplicarJuros(double juros){
        this.setSaldo((this.getSaldo() * juros)  + this.getSaldo());
    }
    
}
