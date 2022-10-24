import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Double> notas = new ArrayList<>();
        notas.add(0.55);
        //Lista que não pode ser alterada
        List<Double> notasFixas = Arrays.asList(1.1, 2d, 4.405);

        System.out.println(notas);
        System.out.println(notasFixas);
        System.out.println(notasFixas);
    }
}