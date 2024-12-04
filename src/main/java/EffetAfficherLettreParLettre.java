import bandeau.Bandeau;

public class EffetAfficherLettreParLettre extends Effet {
    private final int delai;

    public EffetAfficherLettreParLettre(Bandeau bandeau, int delai) {
        super(bandeau);
        this.delai = delai;
    }

    @Override
    public void jouer() {
        String message = bandeau.getMessage();
        StringBuilder texte = new StringBuilder();
        bandeau.setMessage(""); // Commencer avec un message vide
        for (char lettre : message.toCharArray()) {
            texte.append(lettre);
            bandeau.setMessage(texte.toString());
            bandeau.sleep(delai); // Attendre entre chaque lettre
        }
    }
}
