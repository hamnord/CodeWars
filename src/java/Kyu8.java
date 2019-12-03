package java;

public class Kyu8 {


  //false xor false == false - since both are false
  //true xor false == true - exactly one of the two expressions are true

  //your task is to define a function xor(a, b) where a and b are the two expressions to be evaluated.
  // Your xor function should have the behaviour described above
  // returning true if exactly one of the two expressions evaluate to true, false otherwise.
  public static boolean xor(boolean a, boolean b) {
    if( a == b ){
      return true;
    }
    else{
      return false;
    }
  }

  // Create a public class called Cube without a constructor which gets one single private Integer variable Side,
  // a getter GetSide() and a setter SetSide(int num) method for this property.

  private int side;

  public int getSide() {return this.side;}

  public void setSide(int num) { this.side = num;}

  //Create a function (or write a script in Shell) that takes an integer as an argument
  // and returns "Even" for even numbers or "Odd" for odd numbers.

  public static String even_or_odd(int number) {
    return (number % 2 == 0) ? "Even" : "Odd";

  }
