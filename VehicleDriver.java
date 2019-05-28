class Main {
  public static void main(String[] args) {
    
    Vehicle fastboi = new Vehicle(108, "Electric Blue", 1200, false);

    System.out.println(fastboi.startMoving());

    GroundVehicle goKart = new GroundVehicle(108, "Electric Blue", 1200, false, 4, "Go Kart");

    String result = goKart.startMoving();
    System.out.println(result);
  }
}
