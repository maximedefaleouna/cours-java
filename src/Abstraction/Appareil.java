package Abstraction;

public abstract class Appareil implements Allumage {

    //methode abstraite
    public  abstract  void seConnecter() ;

    public  void branche(){
        System.out.println("Branche technologique");
    }
}

