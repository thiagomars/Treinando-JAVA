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
    }
}