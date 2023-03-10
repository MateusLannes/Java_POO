package Projetos_Java.Projeto_Banco.src;

/**
 * @author Mateus Lannes Cunha
 * data    22/02/2023
 */

public class Pessoa {
    String nome;
    Data dtNasc;
    char sexo;
    String cpf;
    
    Pessoa(){

    }

    Pessoa(String n, char s, String c, Data d){
        this.nome = n;
        this.sexo = s;
        this.cpf = c;
        this.dtNasc = d;]
        System.out.println("Nova pessoa criada no sistema.");
    }

    int idade(Data hoje) {
        /* não retorna mais a idade da pessoa */
        int diaAtual = hoje.dia;
        int mesAtual = hoje.mes;
        int anoAtual = hoje.ano;

        int diaNasc = this.dtNasc.dia;
        int mesNasc = this.dtNasc.mes;
        int anoNasc = this.dtNasc.ano;

        int idade = anoAtual - anoNasc;

        if (mesAtual < mesNasc || (mesAtual == mesNasc && diaAtual < diaNasc)) {
            idade--;
        }
        
        System.out.println("A Pessoa "+ nome + " tem " + idade +" anos");
        return idade;
    }



}
