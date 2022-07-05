package aula02b;

public class aula02b {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "bic";
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.destampar();
        c1.carga = 50;
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.modelo = "pilot";
        c2.cor = "preta";
        c2.ponta = 0.7f;
        c2.tampar();
        c2.carga = 100;
        c2.status();
        c2.rabiscar();
    }
}