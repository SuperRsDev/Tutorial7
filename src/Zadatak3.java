import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Zadatak3 {
    public static void izvrsiZadatak() {
        var brojevi = Zadatak2.unesiBrojeve();
        Comparator<Integer> poSumiCifara =
                Comparator.comparingInt(Zadatak2::sumaCifara);
        List sortiraniBrojevi = brojevi.stream().sorted(poSumiCifara).
                collect(Collectors.toList());
        sortiraniBrojevi.stream().forEach(System.out::println);
    }
}
