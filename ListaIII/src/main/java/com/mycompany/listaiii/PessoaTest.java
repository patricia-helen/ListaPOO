package com.mycompany.listaiii;

/**
 *
 * @author patricia
 */
import java.util.Scanner; //Importa a classe Scanner

public class PessoaTest {
    public static void main(String[] args){
        /**Instanciar a Classe: Para criar uma instância da classe, 
         * você usa o operador new, que aloca memória para um novo 
         * objeto da classe e chama seu construtor. 
         *A instância é então referenciada por uma variável.
         */
         /** NomedaClasse variavelreferenciaobjeto(nomeinstancia) = 
          * criandonovainstancia/objeto chamadaconstrutor()
          */
         // Nao e necessario instaciar em metodos estaticos é
         Pessoa pessoa = new Pessoa();
         //Cria um objeto Scanner  para ler  a entrada do teclado 
         Scanner scanner = new Scanner(System.in);
         
         //solicita ao usuario para digitar o nome
         System.out.println("Digite seu nome: ");
         
         //Le a entradaê do usuario e armazena na variavel "Nome"
         String Nome = scanner.nextLine();
         
         // Usa o método setNomePessoa para definir o nome da pessoa
         pessoa.setNomePessoa(Nome);
         
         // Usa o método getNomePessoa para obter o nome e exibi-lo diretamente
         System.out.println("Nome definido usando getNomePessoa: " + pessoa.getNomePessoa());
            
         // Chamada do método estático diretamente pela classe quando nao instancia um objetoã
         //pessoa.displayMessage();
         // Usa o método displayMessage para exibir a mensagem com o nome
         pessoa.displayMessage();
         
         scanner.close();
         // Chamada do método com o nome fornecido
         //pessoa.displayMessage("Patricia");
    }
    
}
