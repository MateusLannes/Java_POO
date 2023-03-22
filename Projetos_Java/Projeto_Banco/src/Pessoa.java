package Projetos_Java.Projeto_Banco.src;

/**
 * @author Mateus Lannes Cunha
 * data    22/02/2023
 */

public class Pessoa {
    protected String nome;
    protected Data dtNasc;
    protected char sexo;
    protected String cpf;
    
    public Pessoa(){

    }

    public Pessoa(String n, char s, String c, Data d){
        this.nome = n;
        this.sexo = s;
        this.cpf = c;
        this.dtNasc = d;
        System.out.println("Nova pessoa criada no sistema.");
    }

    public int idade(Data hoje) {
        /* compara duas idades e retorna a idade da pessoa */
        int diaAtual = hoje.getDia();
        int mesAtual = hoje.getMes();
        int anoAtual = hoje.getAno();

        int diaNasc = this.dtNasc.getDia();
        int mesNasc = this.dtNasc.getMes();
        int anoNasc = this.dtNasc.getAno();

        int idade = anoAtual - anoNasc;

        if (mesAtual < mesNasc || (mesAtual == mesNasc && diaAtual < diaNasc)) {
            idade--;
        }
        
        System.out.println("A Pessoa "+ nome + " tem " + idade +" anos");
        return idade;
    }



}
