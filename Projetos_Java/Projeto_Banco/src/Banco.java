package Projetos_Java.Projeto_Banco.src;

/**
 * @author Mateus Lannes Cunha
 */


public class Banco {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Cria objetos da classe Pessoa */
        Pessoa p1 = new Pessoa("Maria",18,'F',"123.456.789-00");
        Pessoa p2 = new Pessoa("Joao",22,'M',"234.567.890-00");
            

        /* Criando um objeto da classe Conta 
        que pertence a Pessoa p1 e outro a Pessoa p2*/
        Conta c1 = new Conta("1234-5",p1);
        Conta c2 = new Conta("2345-6",p2);
        

  
        c1.extrato();
        c2.extrato();

        c1.sacar(150);
        c1.transferir(100, c2);
        c1.depositar(100);
        c1.transferir(200, c2);

        for(int i = 1; i <= 120 ; i++){
            c1.chequeEspecial(0.5);
            
            if (i%30 == 0){
                System.out.println("Saldo apos " + i + " dias: " + c1.saldo);
            }
        }      
    }
}

