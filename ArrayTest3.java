import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class ArrayTest3 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        int N = in.readInt("dimensione dell'array? ");
        double[] a ; //declare array
        a = new double[N]; //create array
        
        for (int i = 0; i < N; i++)
        a[i]= Math.random();

        for (int i = 0; i < N; i++)
        out.print( "\n" + a[i]);

        double MAX = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < N; i++)
           if (a[i] > MAX) MAX = a[i];
        out.print("\n" + "max " + MAX);

        double sum = 0.0;
        for (int i = 0; i < N; i++)
           sum += a[i];
        double average = sum / N;
        out.print("\n" + "average = " + average);

        double[] b = new double[N];
        for (int i = 0; i < N; i++)
           b[N - i - 1] = a[i];
        
        out.print("\n" + "array inverso" + "\n");   
        for (int i = 0; i < N; i++)
           out.print(b[i] + "\n");
    }
}
