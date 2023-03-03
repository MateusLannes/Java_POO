package Projetos_Java.Projeto_Banco.src;

/**
 * @author Mateus Lannes Cunha
 * data    03/03/2023
 */

public class Aluno extends Pessoa {
    String matricula;

    Aluno(String n, char s, String c, Data d, String mat){
        super(n, s, c, d);
        this.matricula = mat;
    }
}
