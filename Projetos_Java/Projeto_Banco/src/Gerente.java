package Projetos_Java.Projeto_Banco.src;

public class Gerente extends Pessoa {
    String matricula, senha;
    
    Gerente(String n, char s, String c, Data d, String mat, String senha){
        super(n, s, c, d);
        this.matricula = mat;
        this.senha = senha;
    }
}
