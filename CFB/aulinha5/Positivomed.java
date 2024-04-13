package aulinha5;
import java.util.Scanner;
import java.util.Locale;

public class Positivomed {
    public static void main(String[] args){
        Locale.setDefault(Locale.ENGLISH);
        Scanner leitor = new Scanner(System.in);
        int positivos=0;
        float soma = 0;

        for(int i=0; i<6; i++){
            float num = leitor.nextFloat();
            if(num>0){
                positivos++;
                soma = soma + num;
            }
        }
        System.out.printf("%d valores positivos\n", positivos);
        System.out.printf("%.1f\n", soma/positivos);
    }
}
