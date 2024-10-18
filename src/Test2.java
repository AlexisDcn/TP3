import java.util.ArrayList;

class Test2 {
  public static void main(String[] a) {
    Reseau r = new Reseau();

    ArrayList<Float> inputs = new ArrayList<Float>(4);
    inputs.add(0.0F);
    inputs.add(1.0F);
    inputs.add(1.0F);
    inputs.add(1.0F);
    System.out.println("la sortie du réseau de neurones est " + r.calculerSortie(inputs));
  }
}
