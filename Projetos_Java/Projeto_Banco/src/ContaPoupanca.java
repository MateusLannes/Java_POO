package Projetos_Java.Projeto_Banco.src;

/**
 * @author Mateus Lannes Cunha
 * data    03/03/2023
 */

public class ContaPoupanca extends Conta {
    
    public ContaPoupanca(String numero, Pessoa titular, Gerente gerent, Data criac){
        super(numero, titular, gerent, criac);

    
        System.out.println("Nova conta Poupanca adicionada ao sistema.");
    }

    double disponivel() {
        /* retorna o saldo disponivel */
        return this.saldo;
    }

    void extrato(){
        /* imprime o extrado de uma conta */
        System.out.println("*** EXTRATO DA CONTA ***");
        System.out.println("Conta: " + this.numero);
        System.out.println("Titular: " + this.titular.nome);
        System.out.println("Saldo disponivel para saque " + this.disponivel());
    }

    boolean sacar (double valor) {
        /* Realiza um Saque, verificando se é possível sacar */
        if (valor <= this.disponivel()){
            this.saldo -= valor;
            System.out.println("Saque na conta " + this.numero + " realizado "
                                + "com sucesso.");  
            System.out.println("Novo saldo: " + this.saldo);  
            return true;
        }
        else {
            System.out.println("ERRO: nao foi possivel sacar " + valor );
            System.out.println("Valor disponivel para saque" + this.disponivel());
            return false;           
        }
    }

    /* Falta o metodo rendimentos
     * void redimentos (double juros)
     * Poupanca recebe uma taxa de juros como parametro 
     * e adiciona essa porcentagem ao saldo da poupanca
     */
}
