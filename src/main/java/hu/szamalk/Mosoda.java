package hu.szamalk;

public class Mosoda {
    private Ruha[] ruhak;

    public Mosoda() {
        this.ruhak= new Ruha[5];
    }

    public Mosoda(int darab) {
        this.ruhak= new Ruha[darab];
    }

    public void bevesz(Ruha ruha){
        for(int i=0; i<ruhak.length; i++){
            if(ruhak[i]==null) {
                ruhak[i] = ruha;
                System.out.println("Bevette a ruhát!");
            }
        }
        System.out.println("Nincs hely!");
    }

    public void kiad(String tulajdonos){

    }

    public void mos(){
    for(int i=0; i<ruhak.length; i++){
        if(ruhak[i]!=null){
            ruhak[i].setTiszta(true);
            }
        }
        System.out.println("Minden ruha tiszta");
    }
}
