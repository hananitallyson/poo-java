package aula12b;

public class Main {
    public static void main(String[] args) {
        /**
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        m.setPeso(85.3f);
        m.setIdade(2);
        m.setCorPelo("Marrom");
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();

        r.setPeso(102.5f);
        r.setIdade(5);
        r.setMembros(4);
        r.locomover();
        r.alimentar();
        r.emitirSom();

        p.setPeso(0.35f);
        p.setIdade(1);
        p.setMembros(0);
        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.soltarBolha();

        a.setPeso(0.89f);
        a.setIdade(2);
        a.setMembros(2);
        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();
        */

        Mamifero m = new Mamifero();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();

        m.setPeso(5.70f);
        m.setIdade(8);
        m.setMembros(4);
        m.setCorPelo("Preto");
        m.locomover();
        m.alimentar();
        m.emitirSom();

        c.setPeso(55.33f);
        c.setIdade(3);
        c.setMembros(4);
        c.setCorPelo("Marrom");
        c.locomover();
        c.alimentar();
        c.emitirSom();
        c.usarBolsa();

        k.setPeso(3.94f);
        k.setIdade(5);
        k.setMembros(4);
        k.setCorPelo("Branco");
        k.locomover();
        k.alimentar();
        k.emitirSom();
        k.enterrarOsso();
        k.abanarRabo();
    }
}
