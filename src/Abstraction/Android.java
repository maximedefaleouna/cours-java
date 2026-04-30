package Abstraction;

public class Android extends Appareil{
    @Override
    public void seConnecter() {
        System.out.println("on descend la barre puis wifi");
    }

    @Override
    public void allumer() {
        System.out.println("Appareil allumer");
    }

    @Override
    public void eteindre() {

        System.out.println("Appareil éteint");

    }


}
