package Heritage;

public final class Chien extends Animal{
    public Chien(String nom) {
        super(nom);
        System.out.println(" constructeur enfant appélé");
    }

    public void aboyer(){
        System.out.println(super.nom + " aboie ouuuuf");
    }
    @Override
    public  void  manger(){
        System.out.println(nom + " mange comme un chien");
    }
}
