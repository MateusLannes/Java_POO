package Projetos_Java.Projeto_Banco.src;

import java.util.ArrayList;

/**
 * @author Mateus Lannes Cunha
 * data    22/02/2023
 */


public class Banco {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        
        /* Cria objetos da classe Pessoa 
        Data dataNascimentoP1 = new Data(18, 12, 2020);
        Pessoa p1 = new Pessoa("Maria",'F',"123.456.789-00" , dataNascimentoP1);
        
        Data dataNascimentoP2 = new Data(18, 12, 2020);
        Pessoa p2 = new Pessoa("Joao",'M',"234.567.890-00", dataNascimentoP2); 
        
        listaPessoas [] arr = new listaPessoas[10];
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();
        arr[0] = new listaPessoas();
        listaPessoas.add*/


        ArrayList<Pessoa> p = new ArrayList<>();
        ArrayList<Gerente> g = new ArrayList<>();
        ArrayList<Conta> c = new ArrayList<>();

        int op = Menu.imprimeMenuGeral();
        while(op != 0){
            if (op == 1){
                Menu.imprimeMenuCadastro();
            }
            if (op == 2){
                Menu.imprimeMenuMovFinan();
            }

            op = Menu.imprimeMenuGeral();
        }

        //MenuGeral menuGeral = new MenuGeral();
        int opcao = 5;
        while(opcao != 0){

            /* Imprime as opções do Menu Inicial */
            Menu.imprimeMenuGeral();

            /* Verifica as opções e realiza a tarefa de acordo com a opcao selecionada */
            switch (opcao) {
                case 1:
                    Menu.imprimeMenuCadastro();

                    /* Verifica as opções e realiza a tarefa de acordo com a opcao selecionada */
                    switch (opcao){
                        case 1:
                            // Adicionar pessoa
                            break;
                        case 2:
                            // Adicionar gerente
                            break;
                        case 3:
                            // Criar conta corrente
                            break;                        
                        case 4:
                            // criar poupança
                            break;
                        case 0:
                            System.out.println("Saindo...");
                            break;
                    }
                    break;

                case 2:
                    Menu.imprimeMenuMovFinan();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }      
    }
}

