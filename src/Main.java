import Abstraction.Android;
import Abstraction.Appareil;
import Encapsulation.Localisation;
import Encapsulation.Voiture;
import Heritage.Chien;
import Polymorphisme.Calculatrice;
import Polymorphisme.Porpo;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int annee = 2025 ;

        System.out.println("Cours java " + annee);

        Voiture v1 = new Voiture("Toyota") ;

        v1.accelerer(300);
        System.out.println("Vitesse actuelle : " +   v1.getVitesse());
        v1.afficherInfo();

        Localisation Togo = new Localisation(8,1);
        Togo.localisation();

        Chien chien = new Chien("Rambo") ;
        chien.manger();
        chien.aboyer();

        Calculatrice calculatrice = new Calculatrice("Scientifique") ;
        calculatrice.additionner(4,6);
        calculatrice.additionner(10,20,20);

        Porpo porpo = new Porpo("Scientifique" ,"5.0") ;
        porpo.additionner(4,4);
        System.out.println("porpo: " +porpo.getVersion());

        Calculatrice c = porpo ;
//      System.out.println(c.getVersion()); impossible
        c.additionner(7,5);

        Porpo d = (Porpo) c ;
        System.out.println("d: " + d.getVersion());

        Android android = new Android();
        android.allumer();
        android.branche();
        android.seConnecter();
        android.eteindre();
        android.Cick();



















    }
}