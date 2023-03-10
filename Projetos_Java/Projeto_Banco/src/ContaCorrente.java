package Projetos_Java.Projeto_Banco.src;

/**
 * @author Mateus Lannes Cunha
 * data    03/03/2023
 */

public class ContaCorrente extends Conta {
    double limite;

    public ContaCorrente(String numero, Pessoa titular, Gerente gerent, Data criac){
        super( numero, titular,  gerent,  criac);
        this.limite = 200.0;
        System.out.println("Nova Conta Corrente adicionada ao sistema.");
    }

    double disponivel() {
        /* retorna o saldo disponivel */
        return this.saldo + this.limite;
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

    boolean chequeEspecial ( double juros){
        /* caso o saldo esteja negativo é aplicado juros no saldo */
        if ( this.saldo < 0){ 
            this.saldo = this.saldo + (this.saldo * juros )/ 100;
            return true;
        }
        else {
            System.out.println(" Saldo positivo");
            return false;
        }
    }
}
