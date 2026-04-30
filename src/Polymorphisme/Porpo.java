package Polymorphisme;

public class Porpo extends Calculatrice{

    private String version ;

    public  Porpo (String type , String version){
        super(type);
        this.version = version ;
    }

    @Override
    public void additionner(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a+b) + " depuis porpo");

    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }


}
