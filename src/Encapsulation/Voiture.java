package Encapsulation;

public class Voiture {

    private String marque ;
    private int vitesse ;

    public Voiture(String marque) {
        this.marque = marque;
        this.vitesse = 0 ;
    }

    public void accelerer(int value){
        if(value > 0){
            this.vitesse += value ;
        }
    }

    public void  freiner(int value){
        if(value > 0 && vitesse >= value){
            vitesse -= value ;
        }
    }

    public void afficherInfo() {
        System.out.println("Marque: " + marque + ", Vitesse: " + vitesse + " km/h");
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;

    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }


}
