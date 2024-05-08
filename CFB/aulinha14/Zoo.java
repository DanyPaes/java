package aulinha14;

public class Zoo {
    
    private boolean come = false;
    private boolean dorme = false;
    private boolean som = false;
    static int total_animais = 0;

    public Zoo(boolean come, boolean dorme, boolean som) {
        this.come = come;
        this.dorme = dorme;
        this.som = som;
        
    }

    public void setCome(boolean come) {
        this.come = come;
    }
    public boolean getCome() {
        return this.come;
    }

    public void setDorme(boolean dorme) {
        this.dorme = dorme;
    }
    public boolean getDorme() {
        return this.dorme;
    }
    
    public void setSom(boolean som) {
        this.som = som;
    }
    public boolean getSom() {
        return this.som;
    }

    public void setTotalAnimais(int total_animais) {
        total_animais+= 1;
    }
    public int getTotalAnimais() {
        return total_animais;
    }
    
    /*public void setEspecie(String especie) {
        this.especie = especie;
    }
    public String getEspecie() {
        return this.especie;
    }*/
}
