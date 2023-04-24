/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2404;

/**
 *
 * @author Aluno
 */
public class TesteContrato {
    
    public static void main(String[] args){
        
        
        Contrato contrato = new Contrato();
   
        Imovel imovel = new Imovel();
        Endereco endereco = new Endereco();
        Inquilino inquilino = new Inquilino();
        Proprietario proprietario = new Proprietario();
        
        endereco.setCidade("santa cruz");
        endereco.setNumero("111");
        endereco.setRua("das flores");
        
        inquilino.setRenda(200000);
        inquilino.setProfissao("programador");
        
       
        proprietario.setConjuge("joaquim");
        
        imovel.setEndereco(endereco);
        imovel.setValor(1500000);
        
        contrato.setData("23/03/2021");
        contrato.setImovel(imovel);
        contrato.setInquilino(inquilino);
        contrato.setProprietario(proprietario);
        
        System.out.println(contrato.getData() + "\n" + contrato.getImovel().getEndereco().getCidade() + "\n" + 
                contrato.getInquilino().getProfissao() + "\n" + contrato.getProprietario().getConjuge() +
                "\n" + contrato.getImovel().getValor() + "\n" + contrato.getInquilino().getRenda() +"\n" +
                 contrato.getImovel().getEndereco().getNumero());
    }
}
