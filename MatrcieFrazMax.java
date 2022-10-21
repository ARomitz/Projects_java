import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class MatrcieFrazMax {
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        int num = 1, den = 1;
        double frazione = (double) num / (double) den;
        int n = in.readInt("quanti elementi nella matrice? ");
        double[] frazioni = new double[n];
        double max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            num = in.readInt("inserisci numeratore ");
            den = in.readInt("inserisci denominatore ");
            frazione = (double) num / (double) den;

            frazioni[i] = frazione;
        }
        for (int i = 0; i < frazioni.length; i++) {
            if (frazioni[i] > max)
                max = frazioni[i];
        }
        out.print("la frazione piu grande e' " + max);
    }
}
