package Projetos_Java.Projeto_Banco.src;

/**
 * @author Mateus Lannes Cunha
 * data    23/02/2023
 */

public class Data {
    private int dia, mes, ano;

    public Data(){

    }
    
    public Data (int d, int m, int a){
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }

    public void imprimirData(){
        /* imprime a data de nascimento de uma pessoa */
        System.out.println("A data e: " + this.dia + "/" + this.mes + "/" + this.ano);
    }

    public int getDia() {
        /* retorna o dia de nascimento */
        return this.dia;
    }

    public int getMes() {
        /* retorna o mes de nascimento */
        return this.mes;
    }

    public int getAno() {
        /* retorna o ano de nascimento */
        return this.ano;
    }

    public boolean maior(Data d2) {
         /* compara duas idades e retorna a idade da pessoa */
         int diaAtual = d2.getDia();
         int mesAtual = d2.getMes();
         int anoAtual = d2.getAno();
 
         int diaNasc = this.getDia();
         int mesNasc = this.getMes();
         int anoNasc = this.getAno();
 
         int idade = anoAtual - anoNasc;
 
        if (mesAtual < mesNasc || (mesAtual == mesNasc && diaAtual < diaNasc)) {
             idade--;
        }
        return true;     
    }
    
    /* public boolean maior(Data d2){}
     * receber outra data d2 como parametro de
     * verificar se a data
     * this (do objeto atual) ́e maior que a data d2 
     * (ou seja, se ela aconteceu apos a data d2)
     */


}
