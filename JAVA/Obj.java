class veh {
    String brand;
    int year;
    //made constructor
    veh(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    void disp() {
        System.out.println("vehicle: " + year + " " + brand);
    }
}
public class Obj {
    public static void main(String[] args) {
        veh car1 = new veh("Maruti", 2019);
        veh car2 = new veh("BMW", 1999);
car1.disp();
car2.disp();
    }
}
