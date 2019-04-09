

class Main {
  public static void main(String[] args) {
    int x = 5;
    switch(x)
    {
      case 1: case 5: //multiple cases can share a line if the resulting code applies
        System.out.println("None");
        break; //break; moves the code out of the cases once the matching case executes
      case 2:
        System.out.println("Pizza");
        break; //break; appears on a line by itself after each case
      case 3: //case sytax is case 3: but it's evaluating case ==3:
        System.out.println("Left");
        break;
      default: //the final case in every switch statement
        System.out.println("Beef");      
    }
  
  }
}