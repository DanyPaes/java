package aulinha5;
import java.util.Locale;
import utils.Input;

public class Positivomed {
    public static void main(String[] args){
        Locale.setDefault(Locale.ENGLISH);
        int positivos=0;
        float soma = 0;

        for(int i=0; i<6; i++){
            float num = Input.entradaFl("Digite um numero: ");
            if(num>0){
                positivos++;
                soma = soma + num;
            }
        }
        System.out.printf("%d valores positivos\n", positivos);
        System.out.printf("%.1f\n", soma/positivos);
    }
}
