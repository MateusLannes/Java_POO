package Projetos_Java.Projeto_Banco.src;
import java.util.Calendar;
/**
 * @author Mateus Lannes Cunha
 */

public class Pessoa {
    String nome;
    Data dtNasc;
    char sexo;
    String cpf;
    int idade;

    Pessoa(String n, char s, String c, Data d){
        this.nome = n;
        this.sexo = s;
        this.cpf = c;
        this.dtNasc = d;
        System.out.println("Nova pessoa criada no sistema.");
    }

    /*void aniversario(){
        /* adiciona um ano na idade da pessoa 
        this.idade = this.idade + 1;
    }*/

    void atribuiCPF( String c){
        /* Altera o valor do atributo CPF */
        this.cpf = c;
    }

    void getDataNascimento(){
        /* retorna o valor da idade da pessoa */
        System.out.println("A data e: " + this.dtNasc.dia + "/" + this.dtNasc.mes + "/" + this.dtNasc.ano);
    }
    void calcularIdade() {
        Calendar hoje = Calendar.getInstance();
        int diaAtual = hoje.get(Calendar.DAY_OF_MONTH);
        int mesAtual = hoje.get(Calendar.MONTH) + 1;
        int anoAtual = hoje.get(Calendar.YEAR);

        int diaNasc = this.dtNasc. dia;
        int mesNasc = this.dtNasc.mes;
        int anoNasc = this.dtNasc.ano;

        int idade = anoAtual - anoNasc;

        if (mesAtual < mesNasc || (mesAtual == mesNasc && diaAtual < diaNasc)) {
            idade--;
        }
        
        this.idade = idade;
        System.out.println("A Pessoa "+ nome + " tem " + idade +" anos");
    }



}
