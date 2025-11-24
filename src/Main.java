


void main() {
    Restaurant resto = new Restaurant("Chez Java");
    Plat p1 = new Plat(1, "Pizza", 50.0);
    Plat p2 = new Plat(2, "Spaghetti", 40.0);
    PlatSpecial p3 = new PlatSpecial(3, "Tacos", 30.0, "Plat du jour");
    resto.AjouterPlatAumenu(p1);
    resto.AjouterPlatAumenu(p2);
    resto.AjouterPlatAumenu(p3);

    Client client = new Client(1, "Omar");
    Serveur serveur1 = new Serveur(1, "Yassine");
    ServeurVIP serveurVIP = new ServeurVIP(2, "Karim", "Gold");

    Commande commande = new Commande(1, "21/11/2025",client,serveur1 );

    commande.ajouterPlat(p1);
    commande.ajouterPlat(p3);
    client.passerCommande(commande);

    resto.AjouterCommande(commande);

    System.out.println("\n--- MENU DU RESTAURANT ---");
    resto.afficherMenu();

    System.out.println("\n--- DÉTAILS DE LA COMMANDE ---");
    System.out.println("Client : " + client.getNom());
    System.out.println("Serveur : " + serveur1.getNom());
    System.out.println("Plats commandés : ");
    for (Plat p : commande.getPlats()) {
        System.out.println(" - " + p);
    }
    System.out.println("TOTAL = " + commande.CalculerTotal() + " DH");
    System.out.println("\n--- COMMANDES DU RESTAURANT ---");
    resto.afficherCommandes();
    System.out.println("\nProgramme terminé avec succès !");

}
