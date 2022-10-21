import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import java.util.Random;

public class ArrayRandompositivi {
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        Random rand = new Random();
        int n = in.readInt("dimensione array? ");
        int[] a = new int[n];
        int max = 1 + in.readInt("numero massimo? ");
        int yes = 2;

        for (int i = 0; i < n; i++) {
            int rnd = rand.nextInt(max);
            int rnd2 = rand.nextInt(yes);
            if ( rnd2 < 1){
                rnd = - rnd;
            }
            a[i] = rnd;
            out.print(a[i] + ",");
        }
    }
}
