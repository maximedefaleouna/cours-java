package Heritage;

public sealed class Animal permits Chat, Chien {

    protected String nom ;

    public Animal(String nom) {
        this.nom = nom;
        System.out.println(" constructeur Parent appélé");

    }

    public  void  manger(){
        System.out.println(nom + " mange");
    }





}
