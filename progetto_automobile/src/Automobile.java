/*questa classe e un Automobile in vendita presso un concessionario*/
public class Automobile {
    String marca;
    String targa;
    int anno;
    float chilometripercorsi;
    int prezzo;

    public Automobile(String marca, String targa, int anno, float chilometripercorsi, int prezzo
    ) {
        this.marca = marca;
        this.targa = targa;
        this.anno = anno;
        this.chilometripercorsi = chilometripercorsi;
        this.prezzo = prezzo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTarga() {
        return this.targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public int getAnno() {
        return this.anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public float getChilometripercorsi() {
        return this.chilometripercorsi;
    }

    public void setChilometripercorsi(float chilometripercorsi) {
        this.chilometripercorsi = chilometripercorsi;
    }

    public int getprezzo() {
        return this.prezzo;
    }
    public void setprezzo(int prezzo) {
        this.prezzo = prezzo;
    }
}