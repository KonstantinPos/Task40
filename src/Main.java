public class Main {
    public static void main(String[] args) {
        int arr[] = new int[20];
        for (int i = 3; i < arr.length; i++) {
            arr[0] = 1;
            arr[1] = 1;
            arr[2] = arr[0] + arr[1];
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
