package aulinha3e4;
import java.util.Locale;
import utils.Input; // importando a classe Input do pacote interno utils
public class Triangulo1043{

    
    public static void main(String[] args){
        Locale.setDefault(Locale.ENGLISH);
        float a, b, c;
        
        String texto = Input.entradaStr("Informe os valores de a, b e c(separados por espaço): ");
        
        String[] valores = texto.split(" ");
        
        System.out.println("ta catando "+ valores.length + " valores");

        a = Float.parseFloat(valores[0]);
        b = Float.parseFloat(valores[1]);
        c = Float.parseFloat(valores[2]);

        if(a+b>c && a+c>b && c+b>a){
            float perimetro = a + b + c;
            System.out.printf("Perimetro = %.1f", perimetro);
        }else{
            float area = ((a + b) * c)/2;
            System.out.printf("Area = %.1f", area);
        }
    }
}










/*
Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem

Area = XX.X
*/