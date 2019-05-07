import java.util.*;

/*class Main {
  public static void main(String[] args) {
    System.out.println("WELCOME TO YOUR LAB ASSIGNMENT");
    System.out.println("Enter your name");

    Scanner reader = new Scanner(System.in);
    String name = reader.nextLine();

    System.out.println("Enter your score for test one");
    Scanner grader1 = new Scanner(System.in);
    Float testOne = grader1.nextFloat();

    System.out.println("Enter your score for test two");
    Scanner grader2 = new Scanner(System.in);
    Float testTwo = grader2.nextFloat();

    System.out.println("Enter your score for test three");
    Scanner grader3 = new Scanner(System.in);
    Float testThree = grader3.nextFloat();

    System.out.println("Grades for " + name + ":");
    System.out.println(testOne);
    System.out.println(testTwo);
    System.out.println(testThree);
    System.out.println("Your test average is " + ((testOne+testTwo+testThree)/3));

  }
}*/
//^^^This was my original submission, which works fine, but could be slimmed down (see below)
class Main {
  public static void main(String[] args) {
    System.out.println("WELCOME TO YOUR LAB ASSIGNMENT");
    System.out.println("Enter your name");

    Scanner reader = new Scanner(System.in);
    String name = reader.nextLine();

    System.out.println("Enter your score for test one");
    Float testOne = reader.nextFloat();

    System.out.println("Enter your score for test two");
    Float testTwo = reader.nextFloat();

    System.out.println("Enter your score for test three");
    Float testThree = reader.nextFloat();

    System.out.println("Grades for " + name + ":");
    System.out.println(testOne);
    System.out.println(testTwo);
    System.out.println(testThree);
    System.out.println("Your test average is " + ((testOne+testTwo+testThree)/3));

    if(((testOne+testTwo+testThree)/3)>=70)
      System.out.println("You are currently passing... somehow.");

      else

      System.out.println("U failin' brah, LOL");

  } //It was not *necessary* to create four scanners, per the uncommented-out code
}