package Projetos_Java.Projeto_Banco.src;

/**
 * @author Mateus Lannes Cunha
 * data    03/03/2023
 */

public class Professor extends Pessoa {
    double salario;


    Professor(String n, char s, String c, Data d, double sal){
        super(n, s, c, d);
        this.salario = sal;
    }
}
