package Projetos_Java.Projeto_Banco.src;

/**
 * @author Mateus Lannes Cunha
 */
public class Conta {
    String numero;
    Pessoa titular;
    double saldo;
    double limite;
    
   


    double disponivel() {
        /* retorna o saldo disponivel */
        return this.saldo + this.limite;
    }

 
    String NomeTitular(){
        /* retorna o nome do titular da conta */
        return this.titular.nome;
    }
       
    void extrato(){
        /* imprime o extrado de uma conta */
        System.out.println("*** EXTRATO DA CONTA ***");
        System.out.println("Conta: " + this.numero);
        System.out.println("Titular: " + NomeTitular());
        System.out.println("Saldo disponivel para saque " + this.disponivel());
    }
    

    

    void depositar(double valor){
        /* deposita um valor em uma conta */
        this.saldo += valor;
    }
    

    boolean sacar (double valor) {
        /* Realiza um Saque, verificando se é possível sacar */
        if (valor <= this.disponivel()){
            this.saldo -= valor;
            System.out.println("Saque na conta " + this.numero + " realizado "
                    + "com sucesso. Novo saldo: " + this.saldo);
            return true;       
        }
        else {
            System.out.println("ERRO: SAque na conta " + this.numero + "nao"
                    + "foi realizado. Valor disponivel: " + this.disponivel());
            return false;
        }
    }
}