
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Veiculo {
    
    
    public String modelo;
    public String marca;
    public String ano;
    public float valor;

    public Veiculo(String modelo, String marca, String ano, float valor) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

   public String getAno(){
       return this.ano;
   }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    public float valorFinal(float valor){
       Float valorFinal;
        
    return  valorFinal =  (float) (valor + (valor * 0.5));
    
    }
}
