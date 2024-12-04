import bandeau.Bandeau;

import java.util.ArrayList;
import java.util.List;

public class Scenario {
    private final List<Effet> effets = new ArrayList<>();
    private final Bandeau bandeau;

    public Scenario(Bandeau bandeau) {
        this.bandeau = bandeau;
    }

    public void ajouterEffet(Effet effet) {
        effets.add(effet);
    }

    public void jouer() {
        for (Effet effet : effets) {
            effet.jouer(); // Jouer chaque effet
        }
    }
}
