import java.util.*;

class Main {



  public static void main(String[] args) {
    /*char c = 'c';
    String s1 = "stringone";
    String s2 = "stringtwo";
    String s3 = s1 + s2 + "LIT";

    s3 =  s3.toUpperCase(); //permanently changes s3 to upper case

    System.out.println(s3.replace("G","o")); //replace is formatted replace(new char,old char)
    System.out.println(s3);*/

    /*String s = "The program says: \"sup biatch???\"";
    System.out.println(s); //backslash allows character literal to print*/

    //user input if statement lesson

    Scanner reader = new Scanner(System.in);
    System.out.println("What's the wifi password???");
    String input = reader.next();

    if(input.equals("ajhotdog"))
    {
      System.out.println("CORRECT! you get no prize");
    } /*these brackets ain't necessary... the 'then' could be on the same line or sitting below on the next line of the if(). The curly brackets nested under the if are just sort of a standardized convention. The code will still work, but may be harder to read or debug if you don't!!!*/
    else
    {
      System.out.println("Try again, loser =D");
    }

  }
}