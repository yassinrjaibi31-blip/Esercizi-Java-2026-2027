public class Animale {
    private String nome;
    private String specie;
    private String razza;
    private int eta;
    private float chilogrammi;

    public Animale
            (String nome, String specie, String razza, int eta, float chilogrammi) {
        this.nome = nome;
        this.specie = specie;
        this.razza = razza;
        this.eta = eta;
        this.chilogrammi = chilogrammi;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSpecie() {
        return this.specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public String getRazza() {
        return this.razza;
    }

    public void setRazza(String razza) {
        this.razza = razza;
    }

    public int getEta() {
        return this.eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public float getChilogrammi() {
        return this.eta;
    }

    public void setChilogrammi(float chilogrammi) {
        this.chilogrammi = chilogrammi;
    }
}
