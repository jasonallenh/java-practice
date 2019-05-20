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

    for(String a:groceries){ //"for each loop" 
      System.out.print(a + " ");
    }
    /* the colon is 'each,' so it reads "for each index in an array called groceries, execute the next line of code." In this context, it works better than a normal for loop because it is self-limited. The mathmatical operator in the for loop above (x < groceries.length) can cause an error if it were >, or =< because of an out-of-bounds array error. */
  }
}
