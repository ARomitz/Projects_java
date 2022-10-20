import prog.io.*;
public class UpperLowerCase {
     /**
     * @param args
     */
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        String str = in.readLine("Inserire una stringa");
        int nMinuscole = 0;
        char c;

        for (int i = 0; i < str.length(); i++){
            c = str.charAt(i);
            if(Character.isLowerCase(c));
            nMinuscole = nMinuscole + 1;
        }

out.print("La stringa " + str + "constiene: ");
out.print(nMinuscole + " Minuscole");
    
}
}
