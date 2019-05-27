class Main {
  public static void main(String[] args) {
    
    Animal myDog = new Animal("Pupper", 18, "brown", 34.5, true, true);
    Animal yourDog = new Animal("Good Boi", 27, "White", 47.65, false, true);

    System.out.println(myDog.eat());
    System.out.println(yourDog.eat());
    System.out.println(myDog.walk());
    System.out.println(yourDog.walk());
    System.out.println(myDog.getLength());
  }
} //may have to change filename to successfully compile!! requires class Animal.java
