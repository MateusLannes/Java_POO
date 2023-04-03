package Projetos_Java.Projeto_Banco.src;

import java.util.Scanner;

/**
 * @author Mateus Lannes Cunha
 * data    30/03/2023
 */


public class Menu {
    int opcao;
    
    public static int lerOpcao(){
        /* le a opcao digitada e retorna ela */
        Scanner ler = new Scanner(System.in); 
        //ler.close();       
        return ler.nextInt();      
    } 

    public static int imprimeMenuGeral() {
        /* imprime as primeiras opcoes do menu */
        System.out.println("Escolha uma das opcoes");
        System.out.println("1) Cadastro");
        System.out.println("2) Movimentacoes financeiras");
        System.out.println("0) Sair");
        System.out.printf("Digite aqui: ");
        return lerOpcao();
    }

    public static void imprimeMenuCadastro() {
        /* imprime as opcoes do menu do cadastro */
        System.out.println("Escolha uma das opcoes");
        System.out.println("1) Adicionar pessoa");
        System.out.println("2) Adicionar gerente");
        System.out.println("3) Criar conta corrente");
        System.out.println("4) Criar poupanca");
        System.out.println("0) Sair");
        System.out.printf("Digite aqui: ");
        
        int opcao = lerOpcao();

        switch(opcao){
            case 1:
                Data dataNascimentoP1 = new Data(18, 12, 2020);
                Pessoa p1 = new Pessoa("Maria",'F',"123.456.789-00" , dataNascimentoP1);
            case 2:
                //Novo Gerente
            case 3:
                //Nova Conta Corrente
            case 4:
                //Nova Conta Poupança
            case 0:
                //Sai
        }

        
    }

    public static int imprimeMenuMovFinan() {
        /* imprime as opcoes do menu Financeiro*/
        System.out.println("Escolha uma das opcoes");
        System.out.println("1) Cadastro");
        System.out.println("2) Movimentacoes financeiras");
        System.out.println("0) Sair");
        System.out.printf("Digite aqui: ");
        return lerOpcao();
    }
}
