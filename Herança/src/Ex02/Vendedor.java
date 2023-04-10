/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex02;

/**
 *
 * @author Aluno
 */
public class Vendedor extends Empregado{

	private double ValorVendas;
	private int qtnVendas;
	
	public double getValorVendas() {
		return ValorVendas;
	}
	public void setValorVendas(double valorVendas) {
		ValorVendas = valorVendas;
	}
	public int getQtnVendas() {
		return qtnVendas;
	}
	public void setQtnVendas(int qtnVendas) {
		this.qtnVendas = qtnVendas;
	}
	public Vendedor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vendedor(double valorVendas, int qtnVendas) {
		super();
		ValorVendas = valorVendas;
		this.qtnVendas = qtnVendas;
	}
	
	
}