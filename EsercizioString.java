import prog.io.*;
public class EsercizioString {
    /**
     * @param args
     */
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        String a = in.readLine("inserisci parola ");
        String b = in.readLine("inserisci un altra parola ");

        int c = a.compareTo(b);
        int l1 = a.length();
        int l2 = b.length();


        if(c == 0){
        out.print("Le parole sono uguali");
    }
    else{
        out.print("Le parole sono diverse");
        if(c < 0){
            out.println("Ordine alfabetico:" + "\n" + a + "\n" + b);
        }
        else{
            out.println("Ordine alfabetico:" + "\n" + b + "\n" + a);
        }
        if(l1 == l2){
            out.println("Le parole sono grandi uguali");
        }
        else{
            if(l1 > l2){
                out.println("Ordine di grandezza:" + "\n" + a + "\n" + b);
            }
            else{
                out.println("Ordine di grandezza:" + "\n" + b + "\n" + a);
            }
        }
    }
}
}