import java.util.ArrayList;

class Test1 {
  public static void main(String[] a) {

    ArrayList<Float> inputs = new ArrayList<Float>();
    inputs.add(1.0F);
    inputs.add(1.0F);
    Neurone n = new Neurone(2);
    System.out.println(n);
    System.out.println("la sortie du neurone est : " + n.calculerSortie(inputs));
  }

}
