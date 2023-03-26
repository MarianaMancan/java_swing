/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Elevador;

import javax.swing.JOptionPane;

/**
 *
 * @author Mariana
 */
public class Elevador {
    
    private int andarAtual ;
    private int totalAndares;
    private int capacidadeElevador;
    private int pessoasTotal;

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public float getCapacidadeElvador() {
        return capacidadeElevador;
    }

    public void setCapacidadeElvador(int capacidadeElvador) {
        this.capacidadeElevador = capacidadeElvador;
    }

    public int getPessoasTotal() {
        return pessoasTotal;
    }

    public void setPessoasTotal(int pessoasTotal) {
        this.pessoasTotal = pessoasTotal;
    }
    
    public void inicializa(int capacidadeElevador, int totalAndares){
        this.capacidadeElevador = capacidadeElevador;
        this.totalAndares = totalAndares;
        this.andarAtual = 0;
        this.pessoasTotal =0;
    }
    public void entrar(){
        if(this.pessoasTotal < this.capacidadeElevador){
            pessoasTotal ++;
        }
        else{
            JOptionPane.showMessageDialog(null, "Elevador está lotado");
        }
    }
    public void remover(){
        if(this.pessoasTotal>0){
            this.pessoasTotal--;
        }  else{
            JOptionPane.showMessageDialog(null, "Não há pessoas no elevador");
        }
    }
    public void subir(){
        if(this.andarAtual<this.totalAndares){
            this.andarAtual++;
        }
          else{
            JOptionPane.showMessageDialog(null, "Não há mais andares pra subir");
        }
    }
      public void descer(){
        if(this.andarAtual!= 0){
            this.andarAtual--;
        }
          else{
            JOptionPane.showMessageDialog(null, "Não há mais andares pra descer");
        }
    }
}
