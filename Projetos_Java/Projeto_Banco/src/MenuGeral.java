package Projetos_Java.Projeto_Banco.src;

import java.util.Scanner;

/**
 * @author Mateus Lannes Cunha
 * data    25/03/2023
 */


public class MenuGeral extends Menu{
    
    public void imprimeMenu() {
            /* imprime as primeiras opcoes do menu */
            System.out.println("Escolha uma das opcoes");
            System.out.println("1) Cadastro");
            System.out.println("2) Movimentacoes financeiras");
            System.out.println("0) Sair");
            System.out.printf("Digite aqui: ");
        }
    
}
