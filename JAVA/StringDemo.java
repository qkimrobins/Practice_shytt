class StringDemo {
    public static void main(String[] args) {
        String s = "Hello";
        s = s + " World";

        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");

        System.out.println(s);
        System.out.println(sb);
    }
}
