import java.io.*
import java.util.Scanner;
public class Storage{

  public static void main (String[] args) {

    byte yearsAtWork = 12; //-128 to 127, only uses 8 bits of data 

    short ageOfUSA = 239; //whole numbers, 16 bits of data, approx. -32000 to 32000

    int age = 25; // 32 bits, -2bil to 2bil, whole number

    long totalBankCash = 234654345765; //largest whole num. 64 bit, trillions+ 

    char firstLetter = "A"; // single character, including all letters and most symbols

    float angle = 47.53 //decimal numbers, lower resolution 32 bit

    double exactAngle = 43.72383723; //64 bits of storage, much higher resolution

    boolean alive = true; // true/false, 1 or 0. simplest variable 

  }
}