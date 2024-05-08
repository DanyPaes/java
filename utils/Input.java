package utils;

import java.util.Scanner;

public class Input {
    private static Scanner entrada = new Scanner(System.in);

    public static String entradaStr(String msg) {
        System.out.print(msg);
        String valor = entrada.nextLine();
        return valor;
    }

    public static int entradaInt(String msg) {
        System.out.print(msg);
        int valor = entrada.nextInt();
        return valor;
    }

    public static double entradaDb(String msg) {
        System.out.print(msg);
        double valor = entrada.nextDouble();
        return valor;
    }

    public static float entradaFl(String msg) {
        System.out.print(msg);
        float valor = entrada.nextFloat();
        return valor;
    }

    public static char entradaChar(String msg) {
        System.out.print(msg);
        char valor = entrada.next().charAt(0);
        return valor;
    }

    public static boolean entradaBool(String msg) {
        System.out.print(msg);
        boolean valor = entrada.nextBoolean();
        return valor;
    }

    public static long entradaLong(String msg) {
        System.out.print(msg);
        long valor = entrada.nextLong();
        return valor;
    }

    public static short entradaShort(String msg) {
        System.out.print(msg);
        short valor = entrada.nextShort();
        return valor;
    }

    public static byte entradaByte(String msg) {
        System.out.print(msg);
        byte valor = entrada.nextByte();
        return valor;
    }

    
}
