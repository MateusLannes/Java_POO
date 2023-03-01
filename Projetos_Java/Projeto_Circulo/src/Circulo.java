package Projetos_Java.Projeto_Circulo.src;



public class Circulo{
    double raio;
    String cor;

    Circulo (double r){
        this.raio = r;
        System.out.println("Raio adicionado ao Circulo.");
    }

    Circulo(double r, String c){
        this.raio = r;
        this.cor = c;
        System.out.println("Racio e cor adicionado ao Circulo.");
    }

    double GetRaio() {
        return this.raio;
    }

    public String GetCor() {
        return this.cor;
    }

}