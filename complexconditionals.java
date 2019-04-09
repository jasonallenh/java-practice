import java.util.*;

class Main {



  public static void main(String[] args) {
    
    Scanner reader = new Scanner(System.in); //created a scanner called reader.
    String input = reader.next();
    String sOne = "abc";
    String sTwo = "z";

    boolean bool1 = input.contains(sOne); //these are boolean variables
    boolean bool2 = input.contains(sTwo); //they return either true or false as a value

      //.contains is a function that returns a boolean value
      //&& is 'and,' || is 'or' and will be used within the brackets of an if()
    if(bool1 || bool2)    
    {
      System.out.println("True");
    }
    else
    {
      System.out.println("Dang bro, you ate shit!!");
    }

  }
}