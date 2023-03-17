package Projetos_Java.Projeto_Banco.src;
import java.util.Scanner;

/**
 * @author Mateus Lannes Cunha
 * data    03/03/2023
 */

public class Gerente extends Pessoa {
    private String matricula, senha;
    
    public Gerente(){

    }

    public Gerente(String n, char s, String c, Data d, String mat, String senha){
        super(n, s, c, d);
        this.matricula = mat;
        this.senha = senha;
    }

    public boolean validarAcesso(String s) {
        /* valida se a senha s é igual a senha do gerente */
        return s.equals(this.senha);
    }

    public boolean validarAcesso(){
        /* Recebe uma senha pelo input e verifica se ela é a do gerente  */
        Scanner ler = new Scanner(System.in);
        String senha;

        System.out.printf("Informe a senha: ");
        senha = ler.next();
        return (validarAcesso(senha));
    }
     
}
