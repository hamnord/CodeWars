package java;

public class Kyu8 {


  //false xor false == false - since both are false
  //true xor false == true - exactly one of the two expressions are true

  //your task is to define a function xor(a, b) where a and b are the two expressions to be evaluated.
  // Your xor function should have the behaviour described above
  // returning true if exactly one of the two expressions evaluate to true, false otherwise.
  public static boolean xor(boolean a, boolean b) {
    if( a == b ) {
      return true; }
    else {
      return false; }
  }

  // Create a public class called Cube without a constructor which gets one single private Integer variable Side,
  // a getter GetSide() and a setter SetSide(int num) method for this property.
  private int side;
  public int getSide() {return this.side;}
  public void setSide(int num) { this.side = num;}

  //Simple challenge - Output should be the length of the longest word, as a number.
  public static int findLongest(String str){
    String[] spl = str.split(" ");
    int longest = 0;

    for (int i=0; i < spl.length; i++) {
      if (longest < spl[i].length()) {
        longest = spl[i].length();
      }
    }
    return longest;
  }

}

