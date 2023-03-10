package Projetos_Java.Projeto_Banco.src;

/**
 * @author Mateus Lannes Cunha
 * data    03/03/2023
 */

public class Gerente extends Pessoa {
    String matricula, senha;
    
    Gerente(){

    }

    Gerente(String n, char s, String c, Data d, String mat, String senha){
        super(n, s, c, d);
        this.matricula = mat;
        this.senha = senha;
    }

    /* boolean validarAcesso(String s) 
     * Receberá outra senha como parametro
     * e vai verificar se ela é correta
    */
    
    /*
     * boolean validarAcesso()
     */
}
