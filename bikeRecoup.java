import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Bike Mileage Tracker and Payoff Calculator");
    System.out.print("\nEnter cost of bike: $");

    Scanner tracker = new Scanner(System.in);
    int bikeCost = tracker.nextInt();

    System.out.print("\nEnter current odometer reading (in miles): ");

    int mileage = tracker.nextInt();

    int payoffPercentage = (int)((mileage * .33)/bikeCost*100);

    System.out.println("\nBased on .33per mile COO, you have recouped " + payoffPercentage + "% of the cost of your bike. KEEP RIDING!");

     

  }
}