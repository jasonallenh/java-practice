import java.util.*;

class Main {
  public static void main(String[] args) {

  String[] turn = {"180","360","540","720","1080"};
  List<String> list = java.util.Arrays.asList(turn); //this class turns an existing array into a list.
  List<String> unmodList = Collections.unmodifiableList(list);//this class makes an existing list immutable

  for(String p:unmodList){
    System.out.println(p);
  }
  System.out.println();
  System.out.println(unmodList.get(0));

  /*unmodlist.add("464"); //this won't work because the list cannot be modified.*/
  }
}
