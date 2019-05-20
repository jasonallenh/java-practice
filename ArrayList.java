import java.util.*;

class Main {
  public static void main(String[] args) {

    ArrayList languages = new ArrayList(3); //ArrayList is not of a fixed size. It grows as you add to it later in the code. Parameterize your arraylist with <String> to prevent type mismatch issues. ArrayList<String> languages = new ArrayList<String>(3);, in this case
    languages.add("Dothraki");
    languages.add("High Valerian");
    languages.add("The Common Tongue");

    System.out.println(languages.size());

    languages.add("Ghiscari");

    System.out.println(languages.size());
    System.out.println(languages.get(2));

  }
}
