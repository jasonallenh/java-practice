import java.util.*;

class Main {
  public static void main(String[] args) {
    System.out.println("DAILY BUDGET CALCULATOR");

    Scanner input = new Scanner(System.in);

    System.out.println("How often do you get paid (in days)?");
    float term = input.nextFloat();

    System.out.println("How much is your average paycheck?");
    float check = input.nextFloat();

    System.out.println("How much is the total dollar ammount of all your reoccuring bills?");
    float expense = input.nextFloat();

    System.out.println("How much do you want to save over each period?");
    float bwSavings = input.nextFloat();

    float dBudget = (check - expense - bwSavings - 50)/term;

    System.out.println("You should set a target to spend no more than " + dBudget + " a day to meet your budget goal.");


  }
}