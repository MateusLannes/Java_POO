package Projetos_Java.Projeto_Banco.src;

/**
 * @author Mateus Lannes Cunha
 * data    03/03/2023
 */

public class ContaCorrente extends Conta {
    double limite;

    ContaCorrente(String numero, Pessoa titular, Gerente gerent, Data criac){
        super( numero, titular,  gerent,  criac);
        this.limite = 200.0;
        System.out.println("Nova Conta Corrente adicionada ao sistema.");
    }

    void alterarLimite(String pwd, double l){
        if(senhadigitada = pwd){
            System.in();
            System.out.println("Novo limite: " + this.limite)
        }
        
        /*
        pwd é a senha do gerente
        então o metodo precisa validar a senha antes de 
        alterar o limite
         */
    }

    void alterarLimite(){

    }
    
    double disponivel() {
        /* retorna o saldo disponivel */
        return this.saldo + this.limite;
    }

    void extrato(){
        /* imprime o extrado de uma conta */
        System.out.println("*** EXTRATO DA CONTA CORRENTE ***");
        super.extrato();
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
