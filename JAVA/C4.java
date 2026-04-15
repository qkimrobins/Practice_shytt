class stud{
  int roll;
  String name;
  void setdata(int r, String n){
    roll= r;
    name=n;
  }
  void getdata(){
    System.out.println("\nRoll no"+" "+roll+" "+"Name "+name);
  }
}
class C4{
  public static void main(String args[]){
    stud s1= new stud();
    s1.setdata(101,"Robby");
    stud s2 = new stud();
    s2.setdata(50,"pranav");
    s1.getdata();
    s2.getdata();
  }
}
