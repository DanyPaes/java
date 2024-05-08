package aulinha14;
public class Heranca {
    public static void main(String[] args) {
        
        Zoo animal1 = new Zoo(true, true, true);
        Zoo animal2 = new Zoo(true, true, false);
        Zoo animal3 = new Zoo(false, true, true);
        
        System.out.println("Animal 1: " + animal1.getCome());
        animal1.setCome(false);
        System.out.println("Animal 1: " + animal1.getCome());


    }
}