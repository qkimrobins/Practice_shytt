class Largest {
    public static void main(String[] args) {
        int arr[] = {5, 10, 3, 20};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Max = " + max);
    }
}
