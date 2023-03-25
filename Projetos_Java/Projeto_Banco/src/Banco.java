package Projetos_Java.Projeto_Banco.src;


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
        Pessoa p2 = new Pessoa("Joao",'M',"234.567.890-00", dataNascimentoP2);*/   
        
        MenuGeral menuGeral = new MenuGeral();
        int opcao = 5;
        while(opcao != 0){
            menuGeral.imprimeMenu();
            opcao = menuGeral.lerOpcao();
            switch (opcao) {
                case 1:
                    // código para a opção 1
                    break;
                case 2:
                    // código para a opção 2
                    break;
                // adicione mais casos conforme necessário
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

