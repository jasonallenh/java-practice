import java.util.*;

public class Main{

  public static void main (String[] args) {

    Scanner gpaGet = new Scanner(System.in);

    Scanner hoursGet = new Scanner(System.in);

    System.out.println("Semester GPA?");
    double gpa = gpaGet.nextDouble();

    System.out.println("Number of Credit Hours?");
    int hours = hoursGet.nextInt();

    if(gpa > 3.5 && hours > 12){
      System.out.println("Congrats! you made the Honor roll!");
    }else{
      System.out.println("Lol u suk!");
    }
  }
}