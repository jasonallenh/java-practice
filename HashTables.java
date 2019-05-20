import java.util.*;

class Main {
  public static void main(String[] args) {

  Hashtable <String,String> statesAndCapitals = new Hashtable<String,String>();

  statesAndCapitals.put("Connecticut","Hartford"); //adds a key and its value. ("key","value");
  statesAndCapitals.put("Mississippi","Jackson");
  statesAndCapitals.put("New York","Albany");
  statesAndCapitals.put("Florida","Tallahassee");
  statesAndCapitals.put("Alabama","Birmingham");

  String ConnCap = statesAndCapitals.get("Connecticut");//Asks for the value of a given key- Connecticut. It is then assigned to the ConnCap variable.

  System.out.println(ConnCap);

  System.out.println("Values: " + statesAndCapitals.values()); //.values lists the values
  System.out.println("Keys: " + statesAndCapitals.keySet()); //.keySet lists the keys

  }
}
