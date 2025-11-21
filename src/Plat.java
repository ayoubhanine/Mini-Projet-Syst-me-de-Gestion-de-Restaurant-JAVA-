public class Plat {
    protected int idPlat;
    protected String nom;
    protected double Prix;

    public Plat(int idPlat, String nom, double prix) {
        this.idPlat = idPlat;
        this.nom = nom;
        Prix = prix;
    }

    public int getIdPlat() {
        return idPlat;
    }

    public void setIdPlat(int idPlat) {
        this.idPlat = idPlat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return Prix;
    }

    public void setPrix(double prix) {
        Prix = prix;
    }

    @Override
    public String toString() {
        return "Plat{" +
                "idPlat=" + idPlat +
                ", nom='" + nom + '\'' +
                ", Prix=" + Prix +
                '}';
    }
}
