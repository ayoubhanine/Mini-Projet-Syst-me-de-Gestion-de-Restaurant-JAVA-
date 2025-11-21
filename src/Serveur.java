public class Serveur {
    private String nom;
    private int idServeur;

    Serveur(String nom, int idServeur){
        this.idServeur=idServeur;
        this.nom=nom;
    }

    public void prendreCommande(Commande c){

        System.out.println("le serveur "+getNom()+" a pris la commande: "+c.getIdCommande());

    }










    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getIdServeur() {
        return idServeur;
    }

    public void setIdServeur(int idServeur) {
        this.idServeur = idServeur;
    }
}
