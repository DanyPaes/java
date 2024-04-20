package aulinha7;
import java.util.Arrays;
import java.util.Scanner;
//um programa que recebe uma lisa de numeros e informa se preencheu odos os numeros ou nao, e ordena eles
public class Bagaceira{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        final int[] lista = {23,45,3,2,6};
        int[] luser = new int[lista.length];

        Arreys.sort(lista);

        while(!Arreys.equals(lista, luser)){
            for(int i = 0; i < luser.length; i++){
                luser[i] = entrada.nextInt();
            
            }
        }
        
        Arrays.sort(luser);
        for(int i = 0; i < luser.length; i++){
            System.out.printf("-----%d\n", luser[i]);
        }
    
    }
}