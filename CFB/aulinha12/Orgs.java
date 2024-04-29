package aulinha12;

public class Orgs {

    private String nome = null;
    private int players = 0;

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


}
