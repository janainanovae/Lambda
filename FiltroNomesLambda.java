import java.util.Arrays;
import java.util.List;

public class FiltroNomesLambda {

    public static void main(String[] args) {
        List<String> nomes = Arrays.asList(
                "Ana", "Bruno", "Carlos", "Amanda", "Beatriz", "Alberto", "Diana");

        // Expressão Lambda que implementa FiltroNome: true quando o nome começa com "A"
        FiltroNome comecaComA = nome -> nome.startsWith("A");

        System.out.println("Todos os nomes: " + nomes);
        System.out.println();
        System.out.println("Nomes que começam com \"A\":");

        // filter() espera uma regra que devolva boolean; usamos o método testar() da nossa interface
        nomes.stream()
                .filter(comecaComA::testar)
                .forEach(System.out::println);
    }
}
