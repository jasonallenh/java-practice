import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner register = new Scanner(System.in);

    System.out.println("Enter the product name");
    String pName = register.nextLine();

    System.out.println("What is the price of the item?");
    float pPrice = register.nextFloat();

    System.out.println("Enter the quantity");
    int qty = register.nextInt();

    System.out.println("Enter the local tax rate");
    float taxRate = register.nextFloat();


    System.out.println("**********INVOICE**********");
    System.out.println("Quantity of " + qty +" "+ pName + " @ " + pPrice);
    System.out.println("Subtotal: " + (qty * pPrice));
    System.out.println("Tax: " + (qty * pPrice * taxRate));
    System.out.println("Total: " + ((qty * pPrice * taxRate)+(qty * pPrice)));
  

    
  }
}