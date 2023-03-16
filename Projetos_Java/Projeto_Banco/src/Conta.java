package Projetos_Java.Projeto_Banco.src;

/**
 * @author Mateus Lannes Cunha
 * data    22/02/2023
 */

public class Conta {
    String numero;
    Pessoa titular;
    double saldo;
    Data criacao;
    Gerente ger; // gerente da Conta


    Conta(Gerente g){
        this.ger = g;
    }

    public Conta(String numero, Pessoa titular, Gerente gerent, Data criac){
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
        this.ger = gerent;
        this.criacao = criac;
        System.out.println("Nova conta adicionada ao sistema.");
    }

    void depositar(double valor){
        /* deposita um valor em uma conta */
        this.saldo += valor;
        System.out.println("Deposito de " + valor + " realizado com sucesso.");
        System.out.println("Novo saldo: " + this.saldo);
    }

    double disponivel(){
        /* retorna o saldo disponivel */
        return saldo;
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


    
    void extrato(){
        /* imprime o extrado de uma conta */
        System.out.println("Conta: " + this.numero);
        System.out.println("Titular: " + this.titular.nome);
        System.out.println("Saldo disponivel para saque " + this.disponivel());
    }    

    boolean transferir(double valor, Conta destino){
        /* Transfere dinheiro para uma conta caso haja saldo disponivel (nao leva em conta o limite) */
        if (this.disponivel() >= valor){
            this.saldo = this.saldo - valor;
            destino.saldo = valor;

            System.out.println("A Conta: " + this.numero + "fez a transferencia de: " + valor + " e seu novo saldo" + this.disponivel());
            System.out.println("Novo saldo da Conta destino: " + destino.numero + ": " + destino.disponivel());   
            return true;
        }
        else{
            return false;
        }
    }
}