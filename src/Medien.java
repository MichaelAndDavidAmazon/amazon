public class Medien {
    private String titel;
    private String kommentar;
    private String erscheinungsdatum;
    private Urheber urheber;
    private Genre genre;

    public Medien(String titel, String kommentar, String erscheinungsdatum, Urheber urheber, Genre genre) {
        this.titel = titel;
        this.kommentar = kommentar;
        this.erscheinungsdatum = erscheinungsdatum;
        this.urheber = urheber;
        this.genre = genre;
    }
     public String getTitel() {
        return titel;
    }
    public void setTitel(String titel) {
        this.titel = titel;
    }
    public String getKommentar() {
        return kommentar;
    }
    public void setKommentar(String kommentar) {
        this.kommentar = kommentar;
    }
    public String getErscheinungsdatum() {
        return erscheinungsdatum;
    }
    public void setErscheinungsdatum(String erscheinungsdatum) {
        this.erscheinungsdatum = erscheinungsdatum;
    }
    public Urheber getUrheber() {
        return urheber;
    }
    public void setUrheber(Urheber urheber) {
        this.urheber = urheber;
    }
    public Genre getGenre() {
        return genre;
    }
    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
