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
}
