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

    void atribuiCPF( String c){
        /* Altera o valor do atributo CPF */
        this.cpf = c;
    }

    int getIdade(){
        /* retorna o valor da idade da pessoa */
        return this.idade;
    }



}
