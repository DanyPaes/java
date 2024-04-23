package aulinha9;
import java.util.Scanner;
import java.util.Locale;

public class FiboMet {
    public static void main(String[] args) {
        Scanner bee = new Scanner(System.in);
        Locale.setDefault(Locale.ENGLISH);
        
        int ncasos = bee.nextInt();
        int[] casos = new int[ncasos];
        long[] fibocasos = new long[ncasos];
        System.out.println("casos: " + ncasos);

        for(int i=0; i<ncasos; i++){
            casos[i] = bee.nextInt();
        }

        for(int i = 0; i < ncasos; i++){
            long[] lis = {0, 1};
            for(int j = 0; j<casos[i]; j++){
                lis = fibo(lis[0], lis[1]);
                if (j <= casos[i]){
                    fibocasos[i] = lis[0];
                }
            }
        }
        for(int i=0; i<casos.length; i++){
            System.out.printf("Fib(%d) = %d\n", casos[i], fibocasos[i]);
        }
    }
    
    public static long[] fibo(long a, long b){
        long[] soma = new long[2];
        soma[0] = b;
        soma[1] = a+b;
        
        return soma;
    }
}
//""yt