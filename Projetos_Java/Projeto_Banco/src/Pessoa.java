package Projetos_Java.Projeto_Banco.src;

/**
 * @author Mateus Lannes Cunha
 */

public class Pessoa {
    String nome;
    Data dtNasc;
    char sexo;
    String cpf;

    Pessoa(String n, char s, String c, Data d){
        this.nome = n;
        this.sexo = s;
        this.cpf = c;
        this.dtNasc = d;
        System.out.println("Nova pessoa criada no sistema.");
    }

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
