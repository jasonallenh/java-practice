import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) {

    Scanner grab = new Scanner(System.in);

    System.out.println("What yo name is?");
    String name = grab.nextLine();

    System.out.println("Tell me ya email");
    String mail = grab.nextLine();

    System.out.println("What band you like?");
    String band = grab.nextLine();

    String fname = name.replaceAll(" ","")+".txt"; //replaceAll replaces whats before the comma with whats after. in this case, the goal is to remove any spaces in the string "name"

    try{
      PrintWriter saver = new PrintWriter(fname); //a PrintWriter called "saver" is created. the new filename is the string "name" (with any spaces removed) with a .txt extention. 

      saver.println("Name: " + name); //PrintWriter is writing text in the .txt file and dropping the string specified ("name" in this case)
      saver.println("Email: " + mail);
      saver.println("Band: " + band);
      saver.close(); //Required when saver is done

    }
    catch(FileNotFoundException e){
      System.out.println("You fucked up, fam");
    }
    System.out.println(name + "|" + mail + "|" + band + " hasbeen stored to "+ name + ".txt");


  }
}