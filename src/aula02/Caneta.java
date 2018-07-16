package aula02;

public class Caneta {

    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("Atributos da caneta");
        System.out.println("");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada: " + this.tampada);
    }

    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Erro");
        } else {
            System.out.println("Rabiscando");
        }
    }

    void tampar() {
        //this é uma referência ao objeto que chamou
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
}
