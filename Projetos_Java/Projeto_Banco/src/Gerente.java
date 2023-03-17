package Projetos_Java.Projeto_Banco.src;
import java.util.Scanner;

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

    boolean validarAcesso(String s) {
        /* valida se a senha s é igual a senha do gerente */
        return s.equals(this.senha);
    }

    boolean validarAcesso(){
        /* Recebe uma senha pelo input e verifica se ela é a do gerente  */
        Scanner ler = new Scanner(System.in);
        String senha;

        System.out.printf("Informe a senha: ");
        senha = ler.nextLine();
        return (validarAcesso(senha));
    }
     
}
