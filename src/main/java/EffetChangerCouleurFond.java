import bandeau.Bandeau;

import java.awt.Color;

public class EffetChangerCouleurFond extends Effet {
    private final Color[] couleurs;

    public EffetChangerCouleurFond(Bandeau bandeau, Color[] couleurs) {
        super(bandeau);
        this.couleurs = couleurs;
    }

    @Override
    public void jouer() {
        for (Color couleur : couleurs) {
            bandeau.setBackground(couleur);
            bandeau.sleep(500); // délai de 500 ms entre chaque changement
        }
        bandeau.setBackground(Color.WHITE); // réinitialisation à la couleur par défaut
    }
}
