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

    public Conta(String numero, Pessoa titular){
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
        System.out.println("Nova conta adicionada ao sistema.");
    }

    void depositar(double valor){
        /* deposita um valor em uma conta */
        this.saldo += valor;
        System.out.println("Deposito de " + valor + " realizado com sucesso.");
        System.out.println("Novo saldo: " + this.saldo);
    }

}