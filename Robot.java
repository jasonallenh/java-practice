public class Robot{

  String name;
  int chargeLevel;
  int moveSpeed;
  int calculations;

  public Robot(String setName, int Charge, int Speed, int Calculations){

    name = setName;
    chargeLevel = Charge;
    moveSpeed = Speed;
    calculations = Calculations;
  }

    public String move(){

      if(chargeLevel == 0){
      return "Insufficient battery power. Please charge to continue!!!";

      }else{

      chargeLevel--; 
      return name + " is moving at a speed of " + moveSpeed + "MPH. Battery level is now at " + chargeLevel;
      }
    }
  
    public String calculate(){  //lecturer used public void, but had to use println in the method. I used string here and had to use println in the driver.

      if(chargeLevel == 0){
      return "Insufficient battery power. Please charge to continue!!!";

      }else{

      chargeLevel--; 
      return name + " has completed " + calculations + " calculations. Battery level is now at " + chargeLevel;
      }
    }

    public String charge(){

      chargeLevel = 3;
      return "Robotic unit at full charge!";

    }


  

}
