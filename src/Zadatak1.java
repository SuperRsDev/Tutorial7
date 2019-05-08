import java.util.function.Function;

public class Zadatak1 {
    public static void izvrsiZadatak() {
        Function<Integer,Integer> izracunKvadratne = (Integer broj) -> broj * broj;
        ispisiInterval(izracunKvadratne);
    }

    private static void ispisiInterval(Function<Integer,Integer> func) {
        for(int i = 0;i <= 100;i++) {
            System.out.println(func.apply(i));
        }
    }
}
