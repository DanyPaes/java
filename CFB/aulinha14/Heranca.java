package aulinha14;
public class Heranca {
    public static void main(String[] args) {
        
        Zoo[] animais = new Zoo []{
            new Zoo(true, true, true),
            new Zoo(true, true, false),
            new Zoo(false, true, true)
        };
        
        
        for (Zoo animal : animais) {
            System.out.println("Animal: " + animal.getCome());
            animal.setCome(false);
            System.out.println("Animal: " + animal.getCome());
        }
        

    }
}