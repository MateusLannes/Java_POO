package Projetos_Java.Projeto_Banco.src;

import java.util.Scanner;

public class Menu {
    

    public int lerOpcao(){
        /* le a opcao digitada e retorna ela */
        Scanner ler = new Scanner(System.in); 
        return ler.nextInt();        
    }
}
