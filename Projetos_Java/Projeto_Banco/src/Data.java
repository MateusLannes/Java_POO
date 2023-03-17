package Projetos_Java.Projeto_Banco.src;

/**
 * @author Mateus Lannes Cunha
 * data    23/02/2023
 */

public class Data {
    private int dia, mes, ano;

    public Data (int d, int m, int a){
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }

    public void imprimirData(){
        /* imprime a data de nascimento de uma pessoa */
        System.out.println("A data e: " + this.dia + "/" + this.mes + "/" + this.ano);
    }

    /* public boolean maior(Data d2){}
     * receber outra data d2 como parametro de
     * verificar se a data
     * this (do objeto atual) ́e maior que a data d2 
     * (ou seja, se ela aconteceu apos a data d2)
     */
}
