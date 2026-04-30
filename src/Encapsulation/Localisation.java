package Encapsulation;

public record Localisation(int latitude, int longitude) {

    public void localisation(){
        System.out.println("La situation geographique du Togo est : Latitude "+ latitude + " Dégre et Longitude "+ longitude + " Dégré");

    }

}
