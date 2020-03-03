public class Filme extends Medien{
    private String Regisseur;
    private int spielzeit;
    private boolean uhd;
    private boolean hd;


    public Filme(String titel, String kommentar, String erscheinungsdatum, Urheber urheber, Genre genre, String regisseur, int spielzeit, boolean uhd, boolean hd) {
        super(titel, kommentar, erscheinungsdatum, urheber, genre);
        Regisseur = regisseur;
        this.spielzeit = spielzeit;
        this.uhd = uhd;
        this.hd = hd;
    }

    public String getRegisseur() {
        return Regisseur;
    }
    public void setRegisseur(String regisseur) {
        Regisseur = regisseur;
    }
    public int getSpielzeit() {
        return spielzeit;
    }
    public void setSpielzeit(int spielzeit) {
        this.spielzeit = spielzeit;
    }
    public boolean isUhd() {
        return uhd;
    }
    public void setUhd(boolean uhd) {
        this.uhd = uhd;
    }
    public boolean isHd() {
        return hd;
    }
    public void setHd(boolean hd) {
        this.hd = hd;
    }
}
