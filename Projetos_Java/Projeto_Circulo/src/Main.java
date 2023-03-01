package Projetos_Java.Projeto_Circulo.src;

/**
 * @author Mateus Lannes Cunha
 * data    01/03/2023
 */

public class Main {
    public static void main(String[] args){

        Circulo circulo1 = new Circulo(5, "vermelho");
        Circulo circulo2 = new Circulo(7, "azul");

  
        System.out.println("Circulo1: ");
        System.out.println("Area: " + circulo1.calcularArea());
        System.out.println("Perimetro: " + circulo1.calcularPerimetro());

        System.out.println("Circulo2: ");
        System.out.println("Area: " + circulo2.calcularArea());
        System.out.println("Perimetro: " + circulo2.calcularPerimetro());

    }
    

}
