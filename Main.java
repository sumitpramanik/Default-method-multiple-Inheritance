interface I1{
  public default void m1(){
    System.out.println("Interface I1");
  }
}

interface I2{
  public default void m1(){
    System.out.println("Interface I2");
  }
}

class Main implements I1,I2 {

  public void m1(){
    //Provide your own solution
      System.out.println("Ambiguity resolution provided in Main class");
    //if you want implementation of a particular interface
      I1.super.m1();
  }
  public static void main(String[] args) {
    new Main().m1();
    System.out.println("Hello world!");
  }
}