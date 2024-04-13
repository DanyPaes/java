package aulinha5;
import java.util.Scanner;
import java.util.Locale;

public class CrescenteDesc {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner scan = new Scanner(System.in);
        String[] sep;
        int x=0, y=0;
        String numeros;
        

        do{
            numeros = scan.nextLine();
            sep = numeros.split(" ");

            x = Integer.parseInt(sep[0]);
            y = Integer.parseInt(sep[1]);

            String resultado = ((x<y) ? "Crescente":"Decrescente");
            System.out.println(resultado);
        }while(x!=y);

    }
}
//ver como faz funcao pra consertar ess mierda