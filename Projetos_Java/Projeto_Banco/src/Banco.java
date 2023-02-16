package Projetos_Java.Projeto_Banco.src;

/**
 * @author Mateus Lannes Cunha
 */


public class Banco {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
      
        
        /* Cria um objeto da classe Pessoa */
        Pessoa p1 = new Pessoa();
        p1.nome = "Maria";
        p1.idade = 18;
        p1.sexo = 'F';
        p1.cpf = "123.456.789-00";
        
        /* Cria outro objeto da classe Pessoa */
        Pessoa p2 = new Pessoa();
        p2.nome = "Joao";
        p2.idade = 22;
        p2.sexo = 'M';
        p2.cpf = "234.567.890-00";
        
        /* Criando um objeto da classe Conta 
        que pertence a Pessoa p1*/
        Conta c1 = new Conta();
        c1.numero = "1234-5";
        c1.titular = p1;
        c1.saldo = 100.00;
        c1.limite = 200.0;
        
        /* Criando outro objeto da classe Conta
        que pertence a Pessoa p2*/
        
        Conta c2 = new Conta();
        c2.numero = "2345-6";
        c2.titular = p2; 
        c2. saldo = 150.0;
        c2.limite = 200.0;
        
        //Executando o metodo que imprime o extrato
        //System.out.println("Saldo da conta " + c1.numero +", com o proprietario(" + c1.titular.nome + ") de: "+ c1.saldo);
        c1.extrato();
        c2.extrato();

        //System.out.println("Saldo da conta " + c2.numero + ", com o proprietario (" + c2.titular.nome + ") de: "  + c2.saldo);
    }
    
}

