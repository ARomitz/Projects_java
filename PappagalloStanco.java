import prog.io.*;

class PappagalloStanco {
     public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager ();
        ConsoleOutputManager out = new ConsoleOutputManager ();

        String messaggio, risposta;

        do{
            messaggio = in.readLine("Cosa vuoi che il pappagallo ripeta?");
            risposta = messaggio.toUpperCase();
            out.println(risposta);
            if (messaggio.equals("stanco"))
            break;
        }while (true);
         
    }
}