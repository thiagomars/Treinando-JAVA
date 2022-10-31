import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<>();
        notas.add(0d);
        notas.add(8.5);
        notas.add(10d);
        notas.add(5d);
        notas.add(6d);
        notas.add(6.5);
        //Lista que não pode ser alterada
        List<Double> notasFixas = Arrays.asList(1.1, 2d, 4.405);

        System.out.println(notas);
        System.out.println(notasFixas);
        System.out.println("Posição da nota 5,0 eh: " + notas.indexOf(5d));

        //substituir valor
        notas.set(3, 5.2);
        System.out.println(notas);

        //mostrar tudo, um por vez
        for (Double nota : notas) {
            System.out.println(">> " + nota);
        }

        System.out.println("maior nota: " + Collections.max(notas));
        System.out.println("menor nota: " + Collections.min(notas));

        notas.remove(6d);
        notas.remove(2);
        System.out.println(notas);

        List<Gato> gatos = new ArrayList<>(){{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Xand", 12, "amarelo"));
        }};

        System.out.println(gatos);

        System.out.println("Ordem aleatória: ");
        Collections.shuffle(gatos);
        System.out.println(gatos);
    }
}

class Gato{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }
}