public class Dipendente {
    private String nome;
    private String cognome;
    private String codiceFiscale;
    private float stipendio;
    private int anni;
    private boolean tempoPieno;

    public Dipendente

            (String nome, String cognome, String codiceFiscale,
                    int anni, float stipendio, boolean tempoPieno) {

        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
        this.stipendio = stipendio;
        this.anni = anni;
        this.tempoPieno = tempoPieno;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCodiceFiscale() {
        return this.codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public float getStipendio() {
        return this.stipendio;
    }

    public void setStipendio(float stipendio) {
        this.stipendio = stipendio;
    }

    public int getAnni() {
        return this.anni;
    }

    public void setAnni(int anni) {
        this.anni = anni + 1;
    }

    public boolean getTempoPieno() {
        return this.tempoPieno;
    }

    public void setTempoPieno(boolean tempoPieno) {
        this.tempoPieno = tempoPieno;
    }
}