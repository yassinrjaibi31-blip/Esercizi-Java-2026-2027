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

    public String GetMarca() {
        return this.marca;
    }

    public void SetMarca(String marca) {
        this.marca = marca;
    }

    public String GetTarga() {
        return this.targa;
    }

    public void SetTarga(String targa) {
        this.targa = targa;
    }

    public int GetAnno() {
        return this.anno;
    }

    public void SetAnno(int anno) {
        this.anno = anno;
    }

    public float GetChilometripercorsi() {
        return this.chilometripercorsi;
    }

    public void SetChilometripercorsi(float chilometripercorsi) {
        this.chilometripercorsi = chilometripercorsi;
    }

    public int Getprezzo() {
        return this.prezzo;
    }

    public void setAnno(int prezzo) {
        this.prezzo = prezzo;
    }
}