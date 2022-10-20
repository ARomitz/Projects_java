import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

class EstraiCifre{
    /**
     * @param args
     */
    static public void main(String[] args){
        ConsoleOutputManager out = new ConsoleOutputManager();
        ConsoleInputManager in = new ConsoleInputManager();

        int num = in.readInt("Inserisci un numero");
        boolean numneg = num < 0;
        if(numneg){
            num = -num;
            out.print("Il numero e' negtivo");
        }
        else {
            out.print("Il numero e' positivo");
        }
        int countnum = 0;
        while(num != 0){
            int ultimacifra = num % 10;
            num = num / 10;

            out.print(" La cifra in posizione[");out.print(countnum);out.print("] e': "); out.print(ultimacifra);
            countnum = countnum + 1;
        }
    }


    }
