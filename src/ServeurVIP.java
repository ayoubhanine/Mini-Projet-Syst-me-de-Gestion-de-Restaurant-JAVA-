public class ServeurVIP extends Serveur{
    private String TypeSpecial;


    ServeurVIP(String nom, int idServeur) {
        super(nom, idServeur);
    }

    @Override
    public void prendreCommande(Commande c){

        System.out.println("le serveurVIP "+getNom()+" a pris la commande: "+c.getIdCommande());
    }







    public String getTypeSpecial() {
        return TypeSpecial;
    }

    public void setTypeSpecial(String typeSpecial) {
        TypeSpecial = typeSpecial;
    }
}
