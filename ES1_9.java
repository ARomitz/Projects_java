import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class ES1_9 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        int a;
        int MAX = in.readInt("Quanti numeri vuoi inserire? ");
        int i;
        int b = 1;

        for (i = 0; i < MAX; i++){
            a = in.readInt("inserisci un numero ");
            out.print("il numero inserito e: " + a);
            if (a == 0){
                out.print("sei fuori");
                break;

            }
          b *= a;        }
          out.print("il prodotto dei numeri e" + b);
}
}