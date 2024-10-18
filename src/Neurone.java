import java.util.ArrayList;

public class Neurone {
    //entrées
    Float e1;
    Float e2;
    Float e3;
    //poids
    ArrayList<Float> weights;
    // sortie
    Float s; 

    public Neurone(int n) {
        weights = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            weights.add((float) Math.random());
        }
    }

    @Override
    public String toString() {
        String result = "neurone de poids ";
        for (int i = 0; i < weights.size(); i++) {
            result += weights.get(i);
            if (i < weights.size() - 1) {
                result += " | ";
            }
        }
        return result;
    }

    public Float somme(ArrayList<Float> inputs) {
        if (inputs.size() != weights.size()) {
            throw new IllegalArgumentException("Le nombre d'entrées doit être égal au nombre de poids.");
        }
        Float sum = 0.0f;
        for (int i = 0; i < inputs.size(); i++) {
            sum += inputs.get(i) * weights.get(i);
        }
        return sum;
    }

    public int activation(Float x) {
        return x > 0.5 ? 1 : 0;
    }

    public Float calculerSortie(ArrayList<Float> inputs) {
        s = somme(inputs);
        return s;
    }
}