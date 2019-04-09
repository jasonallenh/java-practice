
import java.util.*;

class Main {
  public static void main(String[] args) {

    Scanner reader = new Scanner(System.in);
    String input;
    String all = "";

    /* while() is similar to if(), but repeating. Read this as "run while i is still greater than zero." !input.equals("STOP") sets the conditional so that the code will execute on a loop as long as the user does not input STOP*/
    do //preloads a value to input since this loop has to begin before user can input
    {

        input = reader.nextLine();
        all += input; //+= operator adds a variable or string to itself. this literally is read as all = all + input
    } while(!input.equals("STOP")); 

    System.out.println(all); //i =5, so this line will print

      /*i--; //decreases i by 1, so the code will repeat since i is still greater than 0 */
  
  
  }
}