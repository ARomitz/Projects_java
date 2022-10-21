import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class IndiceSommaMatrice {
    /**
     * @param args
     */
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        int r = in.readInt("inserisci numero righe ");
        int c = in.readInt("inserisci numero colonne ");

        int[][] array = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                out.println("posizione " + i + "," + j);
                array[i][j] = in.readInt("inserisci elemento ");

            }
        }
        int max = Integer.MIN_VALUE;
        int indiceRiga = 0;
        int IndiceColonna = 0;

        for (int i = 0; i < r; i++) {
            int sommaR = 0;
            for (int j = 0; j < array[i].length; j++) {
                sommaR += array[i][j];
                if (sommaR > max) {
                    max = sommaR;
                    indiceRiga = i + 1;
                }
                sommaR = max;
            }
        }
        out.print("max somma righe" + max + " riga " + indiceRiga);

        max = Integer.MIN_VALUE;

        for (int j = 0; j < c; j++){
            int somma = 0;
            for (int i = 0; i < array[j].length; i++){
                somma += array[i][j];
                if (somma > max){
                    max = somma;
                    IndiceColonna = j + 1;
                }
                somma = max;
            }
        }
        out.print("max colonne " + max + " colonna " + IndiceColonna);

        /*
         * for (int j = 0; j < array.length; j++){
         * int sommaC = 0;
         * for (int i = 0; i < array[j].length; i++) {
         * sommaC += array[i][j];
         * if (sommaC > maxc){
         * maxc = sommaC;
         * IndiceColonna = j + 1;
         * }
         * sommaC = maxc;
         * }
         * }
         * out.print(" max somma colonne " + maxc + " colonna " + IndiceColonna);
         * }
         * }
         */
    }
}