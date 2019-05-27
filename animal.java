public class Animal{

  private static int numberOfAnimals = 0;
  public String name;
  public int length;
  public String color;
  public double weight;
  public boolean hasFur;
  public boolean isHungry;

  public Animal(String Name, int Length, String Color, double Weight, boolean Fur, boolean Hungry){
    name = Name;
    length = Length;
    color = Color;
    weight = Weight;
    hasFur = Fur;
    isHungry = Hungry;
    numberOfAnimals ++;
  }

  public String walk(){
    return name + " is walking";
  }

  public String eat(){
    isHungry = false;
    weight += .1;
    return name + " has eaten.\n" + "Animal now weighs: " + weight + " pounds";
  }

  public String getLength(){
    return name + " has a length of " + length;
  }

}
