import java.util.ArrayList;

public class Neurone {
    //entrées
    Float e1;
    Float e2;
    Float e3;
    //poids
    Float[] weights;
    // sortie
    Float s; 

    public Neurone(int n) {
        weights = new Float[n];
        for (int i = 0; i < n; i++) {
            weights[i] = (float) Math.random();
        }
    }

    
    @Override
    public String toString() {
        String result = "neurone de poids ";
        for (int i = 0; i < weights.length; i++) {
            result += weights[i];
            if (i < weights.length - 1) {
                result += " | ";
            }
        }
        return result;
    }

    public Float somme(Float[] inputs) {
        // if (inputs.length != weights.length) {
        //     throw new IllegalArgumentException("Le nombre d'entrées doit être égal au nombre de poids.");
        // }
        Float sum = 0.0f;
        for (int i = 0; i < inputs.length; i++) {
            sum += inputs[i] * weights[i];
        }
        return sum;
    }

    public int activation(Float x) {
        return x > 0.5 ? 1 : 0;
    }

    
    
}
