package aula11b;

public class Aula11 {
    public static void main(String[] args) {
        /*
         * Pessoa p1 = new Pessoa();
         * Essa linha está errada, pois a classe Pessoa é abstract e não pode ser
         * instanciada.
         */

        Visitante v1 = new Visitante();
        v1.setNome("Rodrigo");
        v1.setIdade(25);
        v1.setSexo("M");
        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Cláudio Pereira");
        a1.setMatricula(3333);
        a1.setCurso("Ensino Médio");
        a1.setIdade(17);
        a1.setSexo("M");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setIdade(20);
        b1.setSexo("M");
        b1.pagarMensalidade();

        Tecnico t1 = new Tecnico();
        t1.setNome("Paola");
        t1.setIdade(18);
        t1.setRegistroProfissional(1234);

        Professor p1 = new Professor();
        p1.setNome("Gustavo Guanabara");

    }
}
