/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex03;

/**
 *
 * @author Aluno
 */
public class Conta {
    
    private int conta;
    private double saldo;

    public Conta(int conta, double saldo) {
        this.conta = conta;
        this.saldo = saldo;
    }

 
    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void debitar(double debito){
      this.saldo -= debito;
    }     
    
    public void creditar(double credito){
        this.saldo += credito;
    }
    
}
