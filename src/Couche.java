import java.util.ArrayList;

public class Couche {
    // Attribut pour stocker les neurones de la couche
    ArrayList<Neurone> neurones;

    // Constructeur qui prend le nombre de neurones n et initialise la couche avec n neurones
    public Couche(int n) {
        neurones = new ArrayList<>(n);
        // Créer n neurones, chaque neurone ayant un nombre d'entrées défini
        for (int i = 0; i < n; i++) {
            neurones.add(new Neurone(2));  // Chaque neurone aura un nombre d'entrées = 2
        }
    }

    // Calculer la sortie de la couche
    public int calculerSortie(ArrayList<Float> inputs) {
        int sum = 0;
        for (Neurone neurone : neurones) {
            sum += neurone.calculerSortie(inputs);
        }
        return sum;
    }

    @Override
    public String toString() {
        String result = "couche : \n";
        for (Neurone neurone : neurones) {
            result += neurone.toString() + "\n";
        }
        return result;
    }

}
