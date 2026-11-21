public class Ricetta {
    private String nome;
    private String nomeChef;
    private int minuti;
    private int porzione;
    private int calorie;
    private boolean vegetariana;


    Ricetta(String nome, String nomeChef, int minuti, int calorie, Boolean vegetariana, int porzione) {
        this.nome = nome;
        this.nomeChef = nomeChef;
        this.minuti = minuti;
        this.porzione = porzione;
        this.calorie = calorie;
        this.vegetariana = vegetariana;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeChef() {
        return this.nomeChef;
    }

    public void setNomeChef(String nomeChef) {
        this.nomeChef = nomeChef;
    }

    public int getMinuti() {
        return this.minuti;
    }

    public void setMinuti(int minuti) {
        this.minuti = minuti;
    }

    public int getPorzione() {
        return this.porzione;
    }

    public void setPorzione(int porzione) {
        this.porzione = porzione;
    }

    public int getCalorie() {
        return this.calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public boolean getVegetariana() {
        return this.vegetariana;
    }

    public void setVegetariana(boolean vegetariana) {
        this.vegetariana = vegetariana;{
        }
    }