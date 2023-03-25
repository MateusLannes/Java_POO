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
        
        /* Cria objetos da classe Pessoa */
        Data dataNascimentoP1 = new Data(18, 12, 2020);
        Pessoa p1 = new Pessoa("Maria",'F',"123.456.789-00" , dataNascimentoP1);
        
        Data dataNascimentoP2 = new Data(18, 12, 2020);
        Pessoa p2 = new Pessoa("Joao",'M',"234.567.890-00", dataNascimentoP2);
            
      
        for(int i = 1; i <= 120 ; i++){
            c1.chequeEspecial(0.5);
            
            if (i%30 == 0){
                System.out.println("Saldo apos " + i + " dias: " + c1.saldo);
            }
        }      
    }
}

