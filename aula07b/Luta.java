package aula07b;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiado() {
        return this.desafiado;
    }

    public void setDesafiado(Lutador dd) {
        this.desafiado = dd;
    }

    public Lutador getDesafiante() {
        return this.desafiante;
    }

    public void setDesafiante(Lutador dt) {
        this.desafiante = dt;
    }

    public int getRounds() {
        return this.rounds;
    }

    public void setRounds(int r) {
        this.rounds = r;
    }

    public boolean getAprovada() {
        return this.aprovada;
    }

    public void setAprovada(boolean a) {
        this.aprovada = a;
    }
    
    public void marcarLuta(Lutador l1, Lutador l2) {
        if ((l1.getCategoria().equals(l2.getCategoria())) && (l1 != l2)){
            setAprovada(true);
            setDesafiado(l1);
            setDesafiante(l2);
        } else {
            setAprovada(false);
            setDesafiado(null);
            setDesafiante(null);
        }
    }

    public void lutar() {
        if (getAprovada()) {
            this.desafiado.apresentar();
            this.desafiante.apresentar();
            Random rd = new Random();
            int vencedor = rd.nextInt(3);

            switch (vencedor) {
                case 0:
                    System.out.println("Empatou!");
                    System.out.println();
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                    
                case 1:
                    System.out.println("["+desafiado.getNome()+" venceu!]");
                    System.out.println();
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                
                case 2:
                    System.out.println("["+desafiante.getNome()+" venceu!]");
                    System.out.println();
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }

        } else {
            System.out.println("Luta não pode acontecer");
        }
    }
}
