import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Zadatak2 {
    public static void izvrsiZadatak() {
        var nizBrojeva = unesiBrojeve();
        Integer[] brojevi = new Integer[nizBrojeva.size()];
        brojevi = nizBrojeva.toArray(brojevi);
        Comparator<Integer> poSumiCifara =
                Comparator.comparingInt(Zadatak2::sumaCifara);
        Arrays.sort(brojevi, poSumiCifara);
    }

    private static ArrayList<Integer> unesiBrojeve() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> brojevi = new ArrayList<>();
        do {
            var unos = sc.nextLine();
            if(unos.equals("")) {
                break;
            }
            brojevi.add(Integer.parseInt(unos));
        } while(sc.hasNextLine());
        return brojevi;
    }

    private static int sumaCifara(int broj) {
        int suma = 0;
        while (broj > 0) {
            suma = suma + broj % 10;
            broj = broj / 10;
        }
        return suma;
    }
}
