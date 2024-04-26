package desafio_lunna;
import java.util.Scanner;

public class Sobrecarga{
    public static void main(String[] args) {
        
        Scanner gp = new Scanner(System.in);
        /*double frete = 0.0;
        final double taxaKM = 1.50;
        final double taxaKG = 1.00;
        final double taxaVOL = 2.00;*/

        double peso = gp.nextInt();
        double km = gp.nextInt();
        double vol = gp.nextDouble();
        int gringo = gp.nextInt();

        System.out.printf("%.2f", calcFrete(peso, km, vol, gringo));
    }

    //Frete Padrão
    public static double calcFrete(double peso, double km){
        double[] jj = {peso, km};
        double[] cesar = taxas(2);
        double frete = 0.0;
        
        for(int i = 0; i < jj.length; i++) {
            frete = frete + (jj[i]*cesar[i]);
        }
        return frete;
        
    }

    //Frete Expresso
    public static double calcFrete(double peso, double km, double vol) {
        double[] jj = {peso, km, vol};
        double[] cesar = taxas(3);
        double frete = 0.0;
        
        for(int i = 0; i < jj.length; i++) {
            frete = frete + (jj[i]*cesar[i]);
        }
        return frete;
    }

    //Frete Internacional
    public static double calcFrete(double peso, double km, double vol, int gringo) {
        double[] jj = {peso, km, vol, gringo};//(gringo ? 1 : 0)};
        double[] cesar = taxas(4);
        double frete = 0.0;
        
        for(int i = 0; i < jj.length; i++) {
            frete = frete + (jj[i]*cesar[i]);
        }
        return frete;
    }
    
    //Haddad
    public static double[] taxas(int op){
        final double[] CESAR = {1.00, 1.50, 2.00, 50};
        double[] taxasNece = new double[op];
        for (int i = 0; i < op; i++){
            taxasNece[i] = CESAR[i];
        }
        return taxasNece;

    }
}
//""yt