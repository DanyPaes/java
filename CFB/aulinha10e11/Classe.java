package aulinha10e11;
import java.util.Scanner;

public class Classe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o nome do clube");

        String nome = scan.nextLine();


        NoMai iriri = new NoMai(false);
        NoMai clube = new NoMai(true);

        clube.Barulho(nome);
    }
}
