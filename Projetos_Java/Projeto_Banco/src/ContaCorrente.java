package Projetos_Java.Projeto_Banco.src;
import java.util.Scanner;

/**
 * @author Mateus Lannes Cunha
 * data    03/03/2023
 */

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(String numero, Pessoa titular, Gerente gerent, Data criac){
        super( numero, titular,  gerent,  criac);
        this.limite = 200.0;
        System.out.println("Nova Conta Corrente adicionada ao sistema.");
    }

    public void alterarLimite(String pwd, double l){
        /* Recebe uma senha e verifica se esta senha é igual a senha
         * do gerente dessa conta, caso a senha seja a mesma
         */
        if(this.ger.validarAcesso(pwd)){
            Scanner ler = new Scanner(System.in);
            Double limite;

            System.out.printf("Informe o novo limite: ");
            this.limite = ler.nextDouble();
            
            System.out.println("Novo limite: " + this.limite);
        }
        else{
            System.out.println("Senha incorreta!");
        }
    }

    public void alterarLimite(){
        /* terminar */
    }
    
    public double disponivel() {
        /* retorna o saldo disponivel */
        return this.saldo + this.limite;
    }

    public void extrato(){
        /* imprime o extrado de uma conta */
        System.out.println("*** EXTRATO DA CONTA CORRENTE ***");
        super.extrato();
    }

    public boolean chequeEspecial ( double juros ){
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
