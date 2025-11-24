import java.util.ArrayList;
import java.util.List;

public class Client {
    private int idClent;
    private String nom;
    private List<Commande> Commandes;


    public Client(int idClent, String nom) {
        this.idClent = idClent;
        this.nom = nom;
        this.Commandes = new ArrayList<>();
    }

    public void passerCommande(Commande c){
        Commandes.add(c);
    }









    public List<Commande> getCommandes() {
        return Commandes;
    }

    public void setCommandes(List<Commande> commandes) {
        Commandes = commandes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getIdClent() {
        return idClent;
    }

    public void setIdClent(int idClent) {
        this.idClent = idClent;
    }

    @Override
    public String toString() {
        return "Client{" +
                "Commandes=" + Commandes +
                ", idClent=" + idClent +
                ", nom='" + nom + '\'' +
                '}';
    }
}
