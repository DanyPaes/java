package aulinha3e4;
import java.util.Scanner;

public class TipoTriangulo {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double a=0, b=0, c=0;
        int casoL = 0, casoA = 0;
        Double temp;

        System.out.println("Digite o valor dos lados: ");
        String lerolero = entrada.nextLine();
        String[] separadas = lerolero.split(" ");
        a = Double.parseDouble(separadas[0]);
        b = Double.parseDouble(separadas[1]);
        c = Double.parseDouble(separadas[2]);
        /*
        Double[] valores = new Double[separadas.length];

        for(int i = 0; i < separadas.length; i++){
            valores[i] = Double.parseDouble(separadas[i]);
        }
        //System.out.println(valores[0]);
        while(valores[0]<valores[1] || valores[1]<valores[2]){
            if(valores[0]<valores[1]){
                temp = valores[0];
                valores[0] = valores[1];
                valores[1] = temp;
                System.out.println("entreiaqui");
            }
            if(valores[1]<valores[2]){
                temp = valores[1];
                valores[1] = valores[2];
                valores[2] = temp;
                System.out.println("entreiaqui2");
            }
        }
        for(int i=0; i < separadas.length; i++){
            System.out.println(valores[i]);*/
        while(a<b || b<c){
            if(a<b){
                temp = a;
                a = b;
                b = temp;
            }
            if(b<c){
                temp = b;
                b = c;
                c = temp;
            }
        }

        casoL = ((a>=(b+c))? 1 : 0);

        if(a==b || b==c || c==a){
            casoL = ((a==b && b==c)? 2:3);//riangulo equilaero ou isoceles
        }
        a = a*a;
        b = b*b;
        c = c*c;

        casoA = ((a<(b+c))? 2:0);//riangulo acuangulo
        casoA = ((a==(b+c))? 3:casoA);//riangulo reangulo
        if(a>(b+c)){
            casoA = 1;//riangulo obusangulo
            if (casoL == 1){
                casoA = 0;
            }
        }

        switch (casoA){
            case 1:
                System.out.println("TRIANGULO OBTUSANGULO");
                break;
            case 2:
                System.out.println("TRIANGULO ACUTANGULO");
                break;
            case 3:
                System.out.println("TRIANGULO RETANGULO");
                break;
            default:
                System.out.println("enho angulo nao");
                break;
        }

        switch(casoL){
            case 1:
                System.out.printf("NAO FORMA TRIANGULO\n");
                break;
            case 2:
                System.out.printf("TRIANGULO EQUILATERO\n");
                break;
            case 3:
                System.out.printf("TRIANGULO ISOSCELES\n");
                break;
            default:
                System.out.printf("enrei em nada\n");
                break;
        }

    }
}