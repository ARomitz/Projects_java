import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class MatriceInteri {
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        int n = in.readInt("quate righe? ");
        int m = in.readInt("quante colonne? ");
        int[][] a = new int[n][m]; // declare and create matrix
        int max = Integer.MIN_VALUE;

        // Reding
        for (int i = 0; i < n; i++) { // lines
            for (int j = 0; j < m; j++) { // colums
                out.println("posizione " + i + "," + j);
                a[i][j] = in.readInt("inserisci elemento ");
            }
        }
        // writing
        out.print("stampo matrice " + "\n");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max)
                    max = a[i][j];
                out.print(a[i][j] + "\t");
            }
            out.println(" ");
        }
        out.print("numero massimo " + max);

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];

            }
        }
        double media = (double)sum / (n * m);
        out.print(" media " + media);

        int[][] b = new int [n][m];
        for (int i = 0; i < a[i].length; i++){
            for (int j = 0; j < a.length; j++){
            b[i][j] = a[j][i];
            }
        }
        out.print(out);
    }
}

