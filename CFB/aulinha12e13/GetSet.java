package aulinha12;
//parte da aula 12 está comentada pra ser mais visivel as coisas da 13
public class GetSet{
    public static void main(String[] args) {
        
        Orgs loud = new Orgs("LOUD", 27);
        Orgs pain = new Orgs("PAIN", 45);

        loud.setNumPlayers(6);
        /*int numloud = loud.getNumPlayers("LOUD");
        String nloud = loud.getNome();*/

        System.out.print(Orgs.finalCamp(loud, pain));
        System.out.print(Orgs.finalCamp(loud, pain));
        System.out.print(Orgs.finalCamp(pain, loud));
        System.out.print(Orgs.finalCamp(loud, pain));
        System.out.print(Orgs.finalCamp(loud, pain));



        //System.out.printf("A organização %s tem %d players", nloud, numloud);


    }
}

//System.out.printf("A organização %s em %d players", this.nome, this.players);