package Projetos_Java.Projeto_Banco.src;

/**
 * @author Mateus Lannes Cunha
 */

public class Pessoa {
    String nome;
    int idade;
    char sexo;
    String cpf;

    void aniversario(){
        /* adiciona um ano na idade da pessoa */
        this.idade = this.idade + 1;
    }



}
