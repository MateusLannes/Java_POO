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

    public double GetRaio() {
        return this.raio;
    }

    public void SetRaio(double r) {
        this.raio = r;
    }

    public String GetCor() {
        return this.cor;
    }

    public void SetCor(String c) {
        this.cor = c;
    }

    public double calcularArea() {
        return 3.14 * this.raio * this.raio;
    }

    public double calcularPerimetro() {
        return 2 * 3.14 * this.raio;
    }

}