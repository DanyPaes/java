package aulinha7;
import java.util.Arrays;
import utils.Input;
//um programa que recebe uma lisa de numeros e informa se preencheu odos os numeros ou nao, e ordena eles
public class Bagaceira{
    public static void main(String[] args){
        final int[] lista = {23,45,3,2,6};
        int[] luser = new int[lista.length];

        Arrays.sort(lista);

        while(!Arrays.equals(lista, luser)){
            for(int i = 0; i < luser.length; i++){
                luser[i] = Input.entradaInt("Digite um numero: ");
            
            }
        }
        
        Arrays.sort(luser);
        for(int i = 0; i < luser.length; i++){
            System.out.printf("-----%d\n", luser[i]);
        }
    
    }
}