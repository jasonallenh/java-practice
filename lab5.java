import java.util.*;
//lab 5: create a pre and post deadline roster
class Main {
  public static void main(String[] args) {

    System.out.println("-----PRE-DEADLINE ROSTER-----");

    ArrayList<String> roster = new ArrayList(5);
      roster.add("C. Giroux");
      roster.add("C. Couturier");
      roster.add("T. Konecny");
      roster.add("S. Gostisbehere");
      roster.add("I. Provorov");
    
    for(String a:roster){ //"for each loop" 
      System.out.println(a);
    }

      roster.add("A. Panarin");
      roster.add("S. Bobrovsky");

    System.out.println("-----POST-DEADLINE ROSTER-----");

    for(int x = 0; x < roster.size(); x++){ 
      System.out.println(roster.get(x));
    }
  }
}
