import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

public class ArrayTest {
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        final int MAX = 10;
        Frazione[] frazioni = new Frazione[MAX];
        
        //fase di lettura
        for (int pos = 0; pos < MAX; pos++){
            int num = in.readInt("num ");
            int den = in.readInt("den ");
                frazioni[pos] = new Frazione(num, den);
            
        }
        //fase di scrittura
        for (int pos = 0; pos < frazioni.length; pos++)
        out.print(frazioni[pos].toString());
    }

}
