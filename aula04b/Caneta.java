package aula04b;

/**
 * Caneta
 */
public class Caneta {
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    public Caneta(String m, float p, String c) { // Método construtor
        this.setModelo(m);
        this.setPonta(p);
        this.setCor(c);
        this.tampar();
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    public boolean getTampada() {
        return tampada;
    }

    public void status() {
        System.out.println("Sobre a caneta:");
        System.out.println("Modelo: "+this.getModelo());
        System.out.println("Ponta: "+this.getPonta());
        System.out.println("Cor: "+this.getCor());
        System.out.println("Tampada: "+this.getTampada());
    }
}
