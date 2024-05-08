package aulinha12e13;

public class Orgs {

    private String nome = null;
    private int players = 0;
    private int trofeus = 0;
    static int split = 2;
    static int ano = 2021;

    public Orgs(String name, int nplayers){
        this.nome = name;
        this.players = nplayers;
    }

    public int getNumPlayers(String org){
        return this.players;
    } 

    public void setNumPlayers(int qtd){
        this.players+= qtd;
    }

    public String getNome(){
        return this.nome;
    }

    static String finalCamp(Orgs timeA, Orgs timeB){
        System.out.printf("\nSe enfrentam na final:\n%s X %s",timeA.nome, timeB.nome);
        timeA.trofeus++;
        if(split > 2){
            split = 1;
            ano+=1;
        }
        System.out.println("\nO time " + timeA.nome + " venceu o campeonato e tem " + timeA.trofeus + " troféus atualmente");
        String vencedor_split = "\nO time " + timeA.nome + " venceu o split " + split + " de " + ano +"\n---------------";
        split++;
        return vencedor_split;
        
    }


}
