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

    void extrato(){
        /* imprime o extrado de uma conta */
        System.out.println("*** EXTRATO DA CONTA POUPANÇA ***");
        super.extrato();
    }

    void rendimentos (double juros){

        this.saldo = this.saldo + (this.saldo * juros )/ 100;
        System.out.println("Novo saldo: " + disponivel());
    }        
}
    

