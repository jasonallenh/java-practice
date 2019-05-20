import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    
    String[] groceries = {
      "soy milk","coffee beans","sugar","grapes","eggs"
    };

    System.out.println("___UNSORTED ARRAY___");
    for(int x = 0; x < groceries.length; x++){ 
      /*groceries.lenth is the number of entries or indices in the array (5, in this example). x = 0, and is incremented by 1 as long as it is less than the number of indices. In each pass of the loop, x is printed, meanin index 0, then index 1, etc until x is no loner less than groceries.lenth BECAUSE once x is equal to groceries.lenth (5), there is no index 5 to print    */
      System.out.print(groceries[x] + " ");
    }

    System.out.println();
    System.out.println("___SORTED ARRAY___");

    Arrays.sort(groceries); //this class alpabetizes indices
     
    for(int x = 0; x < groceries.length; x++){
      System.out.print(groceries[x] + " ");
    }

  

    
  }
}

