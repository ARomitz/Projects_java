import prog.io.*;
public class ArrayTest2 {
    public static void main(String[] args) {
        ConsoleOutputManager out = new ConsoleOutputManager();

        String[] nomi = {"", "", "", ""};

        for (int pos = 0; pos < nomi.length; pos++)
        out.print(nomi[pos].toString());
    }
}
