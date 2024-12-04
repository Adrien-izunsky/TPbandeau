import bandeau.Bandeau;

import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        // Création du bandeau pour afficher les effets
        Bandeau bandeau = new Bandeau();

        // Créer le scénario
        Scenario scenario = new Scenario(bandeau);

        // Ajouter des effets au scénario
        Color[] couleurs = {Color.CYAN, Color.MAGENTA, Color.ORANGE, Color.PINK};
        Effet effetChangerCouleurFond = new EffetChangerCouleurFond(bandeau, couleurs);
        scenario.ajouterEffet(effetChangerCouleurFond);

        Effet effetLettreParLettre = new EffetAfficherLettreParLettre(bandeau, 500); // 500 ms entre chaque lettre
        bandeau.setMessage("Affichage Lettre par Lettre");
        scenario.ajouterEffet(effetLettreParLettre);

        // Lancer le scénario
        scenario.jouer();

        // Fermer le bandeau après l'animation
        bandeau.close();
    }
}
