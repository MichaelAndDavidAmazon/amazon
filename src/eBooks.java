public class eBooks {
    private String autor;
    private String isbn;
    private int seitenanzahl;
    private String auflage;

    public eBooks(String autor, String isbn, int seitenanzahl, String auflage) {
        this.autor = autor;
        this.isbn = isbn;
        this.seitenanzahl = seitenanzahl;
        this.auflage = auflage;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public int getSeitenanzahl() {
        return seitenanzahl;
    }
    public void setSeitenanzahl(int seitenanzahl) {
        this.seitenanzahl = seitenanzahl;
    }
    public String getAuflage() {
        return auflage;
    }
    public void setAuflage(String auflage) {
        this.auflage = auflage;
    }
}
