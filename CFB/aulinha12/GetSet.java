package aulinha12;

public class GetSet{
    public static void main(String[] args) {
        
        Orgs loud = new Orgs("LOUD", 27);

        loud.setNumPlayers(6);
        int numloud = loud.getNumPlayers("LOUD");
        String nloud = loud.getNome();



        System.out.printf("A organização %s tem %d players", nloud, numloud);


    }
}

//System.out.printf("A organização %s em %d players", this.nome, this.players);