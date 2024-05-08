package aulinha5;
import java.util.Locale;
import utils.Input;

public class CrescenteDesc {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        String[] sep;
        int x=0, y=0;
        String numeros;
        

        do{
            numeros = Input.entradaStr("Digite dois numeros inteiros: ");
            sep = numeros.split(" ");

            x = Integer.parseInt(sep[0]);
            y = Integer.parseInt(sep[1]);

            String resultado = ((x<y) ? "Crescente":"Decrescente");
            System.out.println(resultado);
        }while(x!=y);

    }
}
//ver como faz funcao pra consertar ess mierda