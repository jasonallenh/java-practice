class Main {
  public static void main(String[] args) {
    
  Robot jonnyFive = new Robot("Jonny-5", 3, 15, 900);

    String result = jonnyFive.move();
    System.out.println(result);
    System.out.println(jonnyFive.calculate());
    System.out.println(jonnyFive.move());
    System.out.println(jonnyFive.move());
    System.out.println(jonnyFive.calculate());
    System.out.println(jonnyFive.charge());
    System.out.println(jonnyFive.calculate());
    System.out.println(jonnyFive.move());
    
    
    /* Lecturer used the below code instead because he used void instead of String in the methods- the println was in the method instead of this driver. Both work
    
    jonnyFive.move();
    jonnyFive.calculate();
    jonnyFive.move();
    jonnyFive.move();
    jonnyFive.calculate();
    jonnyFive.charge();
    jonnyFive.move();
    jonnyFive.calculate();*/

  }
}
