
package com.mycompany.listaiii;

/**
 *
 * @author patricia
 */

public class Pessoa {
    /** Metodo displayMessage
     */
    //atributo encapsulado nomePessoa
    private String nomePessoa;
    //Método getter para acessar o valor de nomePessoa
    public String getNomePessoa(){
        return nomePessoa;
    }
    // Método setter para modificar o valor de nomePessoa
    public void setNomePessoa(String nomePessoa){
        this.nomePessoa = nomePessoa;
    }
    // Método para exibir uma mensagem com o nome da pessoa
    public void displayMessage(){
        System.out.println("Ola, sou uma pessoa e meu nome e:  " + nomePessoa);
    }
}
    
   /**public void displayMessage(){
   *    System.out.println("Eu sou uma pessoa");
   *}
   * Metodo modificado para aceitar um parâmetro nome
   *public void displayMessage(String Nome){
   *    System.out.println("Ola, meu nome e: " + Nome);
   *}
  *}
*/