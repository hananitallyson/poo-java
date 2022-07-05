package aula07b;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    // Métodos Especiais
    public Lutador(String no, String na, int id, float al, float pe, int vi,int de,int em) {
        setNome(no);
        setNacionalidade(na);
        setIdade(id);
        setAltura(al);
        setPeso(pe);
        setVitorias(vi);
        setDerrotas(de);
        setEmpates(em);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String n) {
        this.nacionalidade = n;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float a) {
        this.altura = a;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float p) {
        this.peso = p;
        setCategoria();
    }

    public String getCategoria() {
        return this.categoria;
    }

    private void setCategoria() {
        if (peso < 52.2) {
            this.categoria = "Inválido";
        } else if (peso <= 70.3) {
            this.categoria = "Leve";
        } else if (peso <= 83.9) {
            this.categoria = "Médio";
        } else if (peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return this.vitorias;
    }

    public void setVitorias(int v) {
        this.vitorias = v;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public void setDerrotas(int d) {
        this.derrotas = d;
    }

    public int getEmpates() {
        return this.empates;
    }

    public void setEmpates(int e) {
        this.empates = e;
    }

    // Métodos Abstratos
    public void apresentar() {
        System.out.println("---------------------------");
        System.out.println("Lutador: "+getNome());
        System.out.println("Origem: "+getNacionalidade());
        System.out.println("Idade: "+getIdade()+" anos");
        System.out.println("Medindo "+getAltura()+" m de altura");
        System.out.println("Pesando "+getPeso()+"Kg");
        System.out.println("Ganhou: "+getVitorias());
        System.out.println("Perdeu: "+getDerrotas());
        System.out.println("Empatou: "+getEmpates());
        System.out.println();
    }

    public void status() {
        System.out.println(getNome());
        System.out.println("É um peso "+getCategoria());
        System.out.println(getVitorias()+" vitórias");
        System.out.println(getDerrotas()+" derrotas");
        System.out.println(getEmpates()+" empates");
        System.out.println();
    }

    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }
}