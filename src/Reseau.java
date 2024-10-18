import java.util.ArrayList;

public class Reseau {

Couche couche1 = new Couche(2);
Couche couche2 = new Couche(1);

ArrayList<Float> inputs = new ArrayList<Float>();

public float calculerSortie(ArrayList<Float> inputs) {  //les entrées
    if (inputs.size() != 4) {
        throw new IllegalArgumentException("erreur d'entrée.");
    }
    // Create inputs for the first layer
    ArrayList<Float> inputsNeurone1 = new ArrayList<>();
    inputsNeurone1.add(inputs.get(0)); // e1
    inputsNeurone1.add(inputs.get(1)); // e2

    ArrayList<Float> inputsNeurone2 = new ArrayList<>();
    inputsNeurone2.add(inputs.get(2)); // e3
    inputsNeurone2.add(inputs.get(3)); // e4

    // Compute outputs of first layer
    ArrayList<Float> outputsLayer1 = new ArrayList<>();
    outputsLayer1.add((float) couche1.neurones.get(0).calculerSortie(inputsNeurone1)); // Neurone 1
    outputsLayer1.add((float) couche1.neurones.get(1).calculerSortie(inputsNeurone2)); // Neurone 2

    // Compute output of second layer (Neurone 3)
    float finalOutput = couche2.neurones.get(0).calculerSortie(outputsLayer1);

    return finalOutput;

    
}


}
