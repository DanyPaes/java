package aulinha14;

public class Mamiferos {
    static int comida = 0;
    static int total_mamiferos = 0;
    private int paridos = 0;
    private int leite = 0;
    
    public Mamiferos(String nome, boolean come, boolean dorme, boolean som) {
        
        total_mamiferos += 1;
    }
    public void setParir(){
        paridos += 1;
    }
    public int getParidos(){
        return paridos;
    }

    public void setAmamentar(int leite){
        this.leite = leite-1;
    }
    public int getLeite(){
        return this.leite;
    }
}
