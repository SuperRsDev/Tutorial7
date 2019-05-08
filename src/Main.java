import java.util.function.Function;

public class Main {

    public static void main(String[] args)
    {
        Function<Integer,Integer> izracunKvadratne = (Integer broj) -> broj * broj;
        ispisiInterval(izracunKvadratne);
    }

    public static void ispisiInterval(Function<Integer,Integer> func) {
        for(int i = 0;i <= 100;i++) {
            System.out.println(func.apply(i));
        }
    }
}
