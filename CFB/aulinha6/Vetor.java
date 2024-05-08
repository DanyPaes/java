//Faça um programa que leia um vetor X[10].
//Substitua a seguir, todos os valores nulos e negativos do vetor X por 1.
//Em seguida mostre o vetor X.
package aulinha6;
import utils.Input;

public class Vetor{
    public static void main(String[] args){
        final int tamanho = 10;
        int[] vetor = new int[tamanho];

        for(int i=0; i<vetor.length; i++){
            vetor[i] = Input.entradaInt("Digite um numero: ");
            if(vetor[i] == 0 || vetor[i]<0){
                vetor[i] = 1;
            }
        } 
        
        for(int i=0; i<vetor.length; i++){
            System.out.printf("X[%d] = %d\n", i, vetor[i]);
        }
    }
}
