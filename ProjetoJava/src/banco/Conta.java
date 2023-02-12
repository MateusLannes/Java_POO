package ProjetoJava.src.banco;

/**
 *
 * @author 20202bsi0110
 */
public class Conta {
    String numero;
    Pessoa titular;
    double saldo;
    double limite;
    
    /**
     * metodo para mostar o saldo disponivel
     */
    double disponivel() {
        return this.saldo + this.limite;
    }
       
    /**
     * metodo para obter o extrato de uma conta
     */
    void extrato(){
        System.out.println("*** EXTRATO DA CONTA ***");
        System.out.println("Conta: " + this.numero);
        System.out.println("Titular: " + this.titular.cpf);
        System.out.println("Saldo disponivel para saque " + this.disponivel());
    }
    

    
    /**
     * @param valor
     * metodo para depositar um valor na Conta
     */
    void depositar(double valor){
        this.saldo += valor;
    }
    
    /**
     * 
     * @param valor
     * @return 
     */
    boolean sacar (double valor) {
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