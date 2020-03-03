import java.util.ArrayList;

public class Medienbibliothek {
    ArrayList<Medien> amazonListe;

    public Medienbibliothek(ArrayList<Medien> amazonListe) {
        this.amazonListe = amazonListe;
    }
    public void hinzufügen(Medium m) {
        this.amazonListe.add(m);
    }
    public void toString()
    {
        for(Medium m:amazonListe){
            System.out.println("-------------------");
            m.toString();
        }
    }
    
    public void sucheNachTitel(String titel){
        ArrayList<Medien> = new ArrayList<>();
        for(Medien m:amazonListe){
            if(m.getTitel.equals(titel)){
                return m;
            }
        }
        return 0;
    }
}
