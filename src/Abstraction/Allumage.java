package Abstraction;

public interface Allumage extends Allumage2 {

    void allumer();
    public  default  void Cick(){
        System.out.println("clique");
    }

}
