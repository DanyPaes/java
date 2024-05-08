package aulinha8;
import utils.Input;
import java.util.Locale;

public class LinhaMatriz {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        final int NUM = 2;
        int linha = Input.entradaInt("Digite a linha: ");
        String operacao = Input.entradaStr("Digite a operacao (S ou M): ");
        System.out.println("linha: " + linha);
        System.out.println("operacao: " + operacao);
        float[][] matriz = new float[NUM][NUM];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                matriz[i][j] = Input.entradaFl("Digite um numero: ");
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
