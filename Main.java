class Main {
  public static void main(String[] args) {
    char c = 'c';
    String s1 = "stringone";
    String s2 = "stringtwo";
    String s3 = s1 + s2 + "LIT";

    s3 =  s3.toUpperCase(); //permanently changes s3 to upper case

    System.out.println(s3.replace("G","o")); //replace is formatted replace(new char,old char)
    System.out.println(s3);

  }
}