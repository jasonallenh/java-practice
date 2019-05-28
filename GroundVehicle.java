public class GroundVehicle extends Vehicle{

  int numWheels;
  String vehicleType;

  public GroundVehicle(int setSpeed, String setColor, double setWeight, boolean tellIfMoving, int setWheels, String setType){

    super(setSpeed, setColor, setWeight, tellIfMoving);
    numWheels = setWheels;
    vehicleType = setType;
  }  

  public String startMoving(){
    isMoving = true;
    return vehicleType + " is moving";
  }  

  public String stopMoving(){
    isMoving = false;
    return vehicleType + " is no longer moving";
  }

  public String whatColor(){
    return vehicleType + " is " + color;
  }  
}
