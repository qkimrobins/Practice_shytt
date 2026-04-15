class f1{
  int x,y,z;
  void sum(int x){
System.out.println("The sum of the elements:"+(x+10));
  }
  void sum (int x, int y){
System.out.println("The sum of x adn y is "+(x+y));
  }
  void sum(int x,int y,int z){
    System.out.println("The sum of xyz is "+(x+y+z));
  }
  void greet(){
    System.out.println("Hello there!!");
  }
}
class f2 extends f1{
  void greet(){
    System.out.println("Chall be dalley");
  }
}
//Function overloading and overriding krni h
class Poly{
  public static void main(String args[]){
 f1 obj = new f1();
 f2 obj1 = new f2();
 obj.sum(5);
 obj.sum(5,10);
obj.sum(5,10,15);
obj.greet();
obj1.greet();
  }
}
