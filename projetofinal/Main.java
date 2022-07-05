package projetofinal;

public class Main {
    public static void main(String[] args) {
        Video[] v = new Video[3];
        v[0] = new Video("Aula 01 POO");
        v[1] = new Video("Aula 02 POO");
        v[2] = new Video("Aula 03 POO");

        Gafanhoto[] g = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "Juba");
        g[1] = new Gafanhoto("Maria Luiza", 12, "F", "Lulu");

        Visualizacao[] vis = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[0] = new Visualizacao(g[0], v[1]);
        vis[0].avaliar(87.0f);
        System.out.println(vis[0].toString());

        /*
        System.out.println("VÍDEOS\n--------------------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\nGAFANHOTOS\n--------------------------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
        */
    }
}
