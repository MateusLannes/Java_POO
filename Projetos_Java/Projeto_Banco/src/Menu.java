package Projetos_Java.Projeto_Banco.src;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Mateus Lannes Cunha
 * data    30/03/2023
 */


public class Menu {
    
    public static Pessoa escolherPessoa(ArrayList<Pessoa> p) {
        Scanner s = new Scanner(System.in);
        int i = 1;
        System.out.println("Escolha o cliente da conta:");

        for(Pessoa tit: p){
            System.out.println( i + ") " + tit.getCpf() + " - " + tit.getNome());
            i++;
        }

        int index = s.nextInt();
        return p.get( index - 1);
    }
    
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

    public static void imprimeMenuCadastro(ArrayList<Pessoa> p, ArrayList<Gerente> g, ArrayList<Conta> c) {
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
                p.add(new Pessoa());
            case 2:
                g.add(new Gerente());
            case 3:
                Pessoa tit = escolherPessoa(p);
                Gerente ger = escolherGerente(g);
                c.add ( new ContaCorrente(tit,ger));
            case 4:
                Pessoa tit = escolherPessoa(p);
                Gerente ger = escolherGerente(g);
                c.add ( new ContaPoupanca(tit,ger));
                //Nova Conta Poupança
            case 0:
                break;
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

