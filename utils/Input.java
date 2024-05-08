package utils;

import java.util.Scanner;

public class Input {
    
    public static String entradaStr(String msg) {
        System.out.print(msg);
        Scanner entrada = new Scanner(System.in);
        String valor = entrada.nextLine();
        entrada.close();
        return valor;
    }

    public static int entradaInt(String msg) {
        System.out.print(msg);
        Scanner entrada = new Scanner(System.in);
        int valor = entrada.nextInt();
        entrada.close();
        return valor;
    }

    public static double entradaDb(String msg) {
        System.out.print(msg);
        Scanner entrada = new Scanner(System.in);
        double valor = entrada.nextDouble();
        entrada.close();
        return valor;
    }

    public static float entradaFl(String msg) {
        System.out.print(msg);
        Scanner entrada = new Scanner(System.in);
        float valor = entrada.nextFloat();
        entrada.close();
        return valor;
    }

    public static char entradaChar(String msg) {
        System.out.print(msg);
        Scanner entrada = new Scanner(System.in);
        char valor = entrada.next().charAt(0);
        entrada.close();
        return valor;
    }

    public static boolean entradaBool(String msg) {
        System.out.print(msg);
        Scanner entrada = new Scanner(System.in);
        boolean valor = entrada.nextBoolean();
        entrada.close();
        return valor;
    }

    public static long entradaLong(String msg) {
        System.out.print(msg);
        Scanner entrada = new Scanner(System.in);
        long valor = entrada.nextLong();
        entrada.close();
        return valor;
    }

    public static short entradaShort(String msg) {
        System.out.print(msg);
        Scanner entrada = new Scanner(System.in);
        short valor = entrada.nextShort();
        entrada.close();
        return valor;
    }

    public static byte entradaByte(String msg) {
        System.out.print(msg);
        Scanner entrada = new Scanner(System.in);
        byte valor = entrada.nextByte();
        entrada.close();
        return valor;
    }

    
}
