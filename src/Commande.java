import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

// Classe Commande
public class Commande {

private int idCommande ;
private String date ;
private Client client ;
private Serveur serveur ;
private List<Plat> plats ;

// Constructeur
    public Commande(int idCommande,String date,Client client,Serveur serveur ){

        this.idCommande = idCommande ;
        this.date = date ;
        this.client = client ;
        this.serveur = serveur ;
        this.plats = new ArrayList<>();


    }
    // Méthodes pour gérer les plats ( Manque classe Plat )
    public void ajouterPlat(Plat plat) {
        plats.add(plat);
    }

    public double CalculerTotal(){
        double Total=0;
        for (int i = 0; i < getCommandes.size(); i++) {
            Total+=getCommandes.get(i).getPrix();

        }
        return Total;
    }


    // Getters et setters
    public int getIdCommande(){
        return idCommande ;
    }

    public void setIdCommande(int idCommande){
        this.idCommande = idCommande ;
    }
    // Getters et setters

    public String getDate(){
        return date ;
    }
    public void setDate( String date){
        this.date = date ;
    }
    // Getters et setters
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    // Getters et setters
    public Serveur getServeur() {
        return serveur;
    }

    public void setServeur(Serveur serveur) {
        this.serveur = serveur;
    }
    // Getters et setters
    public List<Plat> getPlats() {
        return plats;
    }

    public void setPlats(List<Plat> plats) {
        this.plats = plats;
    }
    // Methodes TOstring


    @Override
    public String toString() {
        return "Commande{" +
                "idCommande=" + idCommande +
                ", date='" + date + '\'' +
                ", client=" + client +
                ", serveur=" + serveur +
                ", plats=" + plats +
                '}';
    }
}
