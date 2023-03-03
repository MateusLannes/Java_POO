package Projetos_Java.Projeto_Banco.src;

public class Aluno extends Pessoa {
    String matricula;

    Aluno(String n, char s, String c, Data d, String mat){
        super(n, s, c, d);
        this.matricula = mat;
    }
}
