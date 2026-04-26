public class ArrayList {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60); // triggers resize

        list.print(); // 10 20 30 40 50 60

        list.remove(2);
        list.print(); // 10 20 40 50 60

        System.out.println(list.get(1)); // 20
        System.out.println("Size: " + list.size());
    }
}