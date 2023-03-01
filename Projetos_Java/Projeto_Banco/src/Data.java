package Projetos_Java.Projeto_Banco.src;

/**
 * @author Mateus Lannes Cunha
 * data    23/02/2023
 */

public class Data {
    int dia, mes, ano;

    public Data (int d, int m, int a){
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }

    void imprimirData(){
        /* imprime a data de nascimento de uma pessoa */
        System.out.println("A data e: " + this.dia + "/" + this.mes + "/" + this.ano);
    }
}
