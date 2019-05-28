public class Vehicle{

  int topSpeed;
  String color;
  double weight;
  boolean isMoving;

public Vehicle(int setSpeed, String setColor, double setWeight, boolean tellIfMoving){

  topSpeed = setSpeed;
  color = setColor;
  weight = setWeight;
  isMoving = tellIfMoving;

  }

  public String startMoving(){
    isMoving = true;
    return "Vehicle is moving";
  }  

  public String stopMoving(){
    isMoving = false;
    return "Vehicle is no longer moving";
  }
  
}
