package aula02;

public class Aula02 {

    public static void main(String[] args) {

        Caneta c1 = new Caneta();

        //Atributos do objeto caneta
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();

        //Chamada do método status, que escreve o estado da caneta
        c1.status();
        //Chamada do método rabiscar
        c1.rabiscar();
    }
}
