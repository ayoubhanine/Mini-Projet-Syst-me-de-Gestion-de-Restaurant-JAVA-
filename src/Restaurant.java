import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String nom;
    private List<Plat> Menu;
    private List<Serveur> serveur;
    private List<Commande> commandes;

    public Restaurant(List<Commande> commandes, List<Plat> menu, String nom, List<Serveur> serveur) {
        this.commandes = new ArrayList<>();
        Menu = new ArrayList<>();
        this.nom = nom;
        this.serveur = new ArrayList<>();
    }

    public List<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }

    public List<Plat> getMenu() {
        return Menu;
    }


    public void setMenu(List<Plat> menu) {
        Menu = menu;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Serveur> getServeur() {
        return serveur;
    }

    public void setServeur(List<Serveur> serveur) {
        this.serveur = serveur;
    }
    public void AjouterPlatAumenu(Plat p){
        Menu.add(p);
    }
    public void assignerServeur(Commande c){

    }
    public void afficherMenu(){
        System.out.println("Menu de restaurant :");
        for (Plat p:getMenu()){
            System.out.println(p);
        }
    }
    public void afficherCommandes(){
        for (Commande c:commandes){
            System.out.println("commande "+c);
        }
    }
    public void AjouterCommande(Commande c){
        commandes.add(c);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "commandes=" + commandes +
                ", nom='" + nom + '\'' +
                ", Menu=" + Menu +
                ", serveur=" + serveur +
                '}';
    }

    public void enregistrerCommandes(Commande c){
        for (int i = 0; i < getCommandes().size(); i++) {
            if(getCommandes().get(i).getIdCommande.equals(c.getIdClent())){
                System.out.println("les commandes passes :"+getCommandes().get(i));
            }
        }


}}
