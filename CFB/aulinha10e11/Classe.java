package aulinha10e11;
import utils.Input;

public class Classe {
    public static void main(String[] args) {

        String nome = Input.entradaStr("Digite o nome do clube: ");


        NoMai iriri = new NoMai(false);
        NoMai clube = new NoMai(true);

        clube.Barulho(nome);
        iriri.Barulho(nome);
    }
}
