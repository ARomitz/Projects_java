import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class SommaVettori {
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        int n = in.readInt("lunghezza dei vettori? ");
        out.print("lettura primo array ");
        int[] a = new int[n];
        int[] b = new int[n];

        
        for (int i = 0; i < a.length; i++){
            a[i] = in.readInt("elemento " + i + " ");
        }

        for (int i = 0; i < b.length; i++){
            b[i] = in.readInt("elemento " + i + " ");
        }
        int[] somma = new int[n];

        for (int i = 0; i < somma.length; i++){
            somma[i] = a[i] + b[i];
        }

        out.print("Vettore 1: " + a + "\n");
        out.print("vettore 2: " + b + "\n");
        out.print("somma dei vettori: " + somma);
    }
}
