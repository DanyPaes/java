package aulinha8;
import java.util.Scanner;
import java.util.Locale;

public class LinhaMatriz {
    public static void main(String[] args) {
        Scanner bee = new Scanner(System.in);
        Locale.setDefault(Locale.ENGLISH);
        final int NUM = 2;
        int linha = bee.nextInt();
        String operacao = bee.next();
        System.out.println("linha: " + linha);
        System.out.println("operacao: " + operacao);
        float[][] matriz = new float[NUM][NUM];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                matriz[i][j] = bee.nextFloat();
                //System.out.println("m: " + matriz);
            }
        }
        float soma = 0;
        for(int i = 0; i < matriz.length; i++){
            soma += matriz[linha][i];
        }

        if(operacao.equals("S") || operacao.equals("M")){
            if(operacao.equals("M")){
                soma = soma/NUM;
            }
            System.out.printf("%.1f", soma);
        }

        }
    }
//""yt
