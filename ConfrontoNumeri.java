import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

class ConfrontaNumeri{
    /**
     * @param args
     */
    static public void main(String[] args){
ConsoleInputManager in = new ConsoleInputManager();
ConsoleOutputManager out = new ConsoleOutputManager();

int num1 = in.readInt("Inserisci un numero ");
int num2 =in.readInt("Inserisci un'altro numero ");

if (num1 >(num2)){
    out.print(" il numero piu' grande e': "); out.print(num1);
    out.print(" il numero piu' piccolo e': "); out.print(num2);
}
else {
    out.print(" il numero piu' grande e': "); out.print(num2);
    out.print(" il numero piu' piccolo e': "); out.print(num1);
}
}
    }

    
